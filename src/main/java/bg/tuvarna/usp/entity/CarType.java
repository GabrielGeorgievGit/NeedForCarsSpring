package bg.tuvarna.usp.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_type")
public class CarType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_car_type")
	private int id;
	@Column(name = "car_type")
	private String type;
	@Column(name = "car_coupe")
	private String coupe;

	@OneToMany(mappedBy = "carType")
	private List<CarDescription> carDescriptions;

	public CarType() {

	}

	public CarType(String type, String coupe) {
		super();
		this.type = type;
		this.coupe = coupe;
	}

	public CarType(int id, String type, String coupe) {
		super();
		this.id = id;
		this.type = type;
		this.coupe = coupe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCoupe() {
		return coupe;
	}

	public void setCoupe(String coupe) {
		this.coupe = coupe;
	}

	public List<CarDescription> getCarDescriptions() {
		return carDescriptions;
	}

	public void setCarDescriptions(List<CarDescription> carDescriptions) {
		this.carDescriptions = carDescriptions;
	}

}

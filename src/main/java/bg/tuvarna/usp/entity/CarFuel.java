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
@Table(name = "car_fuels")
public class CarFuel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fuel")
	private int idFuel;

	private String name;

	@OneToMany(mappedBy = "fuel")
	private List<CarDescription> carDescriptions;

	public CarFuel() {

	}

	public CarFuel(String name) {
		super();
		this.name = name;
	}

	public int getIdFuel() {
		return idFuel;
	}

	public void setIdFuel(int idFuel) {
		this.idFuel = idFuel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CarDescription> getCarDescriptions() {
		return carDescriptions;
	}

	public void setCarDescriptions(List<CarDescription> carDescriptions) {
		this.carDescriptions = carDescriptions;
	}
}

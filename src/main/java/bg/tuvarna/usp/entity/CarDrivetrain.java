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
@Table(name = "car_drivetrain")
public class CarDrivetrain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_drivetrain")
	private int id;
	private String name;

	@OneToMany(mappedBy = "drivetrain")
	public List<CarDescription> carDescriptions;

	public CarDrivetrain() {

	}

	public CarDrivetrain(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CarDrivetrain(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

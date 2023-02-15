package bg.tuvarna.usp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="car_transmission")
public class CarTransmission {
	@Id
	private int gears;

	@OneToMany(mappedBy = "transmission")
	private List<CarDescription> carDescriptions;

	public CarTransmission() {

	}

	public CarTransmission(int gears) {
		super();
		this.gears = gears;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

}

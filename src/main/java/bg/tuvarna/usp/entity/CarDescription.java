package bg.tuvarna.usp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_description")
public class CarDescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_car_description")
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_car_type")
	private CarType carType;

	private String brand;
	private String model;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "drivechain")
	private CarDrivetrain drivetrain;

	@Column(name = "car_color")
	private String carColor;
	private int power;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "transmission")
	private CarTransmission transmission;

	private String engine;
	@Column(name = "door_number")
	private int doorNumber;
	private int weight;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fuel")
	private CarFuel fuel;

	private int displacement;
	private String description;

	@OneToMany(mappedBy = "carDescription")
	private List<Announcement> announcements;

	public CarDescription() {

	}

	public void setCarDescription(CarType carType, String brand, String model, CarDrivetrain drivetrain, String carColor,
			int power, CarTransmission transmission, String engine, int doorNumber, int weight, CarFuel fuel,
			int displacement, String description) {
		this.carType = carType;
		this.brand = brand;
		this.model = model;
		this.drivetrain = drivetrain;
		this.carColor = carColor;
		this.power = power;
		this.transmission = transmission;
		this.engine = engine;
		this.doorNumber = doorNumber;
		this.weight = weight;
		this.fuel = fuel;
		this.displacement = displacement;
		this.description = description;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public CarDrivetrain getDrivetrain() {
		return drivetrain;
	}

	public void setDrivetrain(CarDrivetrain drivetrain) {
		this.drivetrain = drivetrain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public CarTransmission getTransmission() {
		return transmission;
	}

	public void setTransmission(CarTransmission transmission) {
		this.transmission = transmission;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public CarFuel getFuel() {
		return fuel;
	}

	public void setFuel(CarFuel fuel) {
		this.fuel = fuel;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Announcement> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(List<Announcement> announcements) {
		this.announcements = announcements;
	}

	public String getTransmissionName() {
		if (transmission.getGears() == 0)
			return "Automatic";
		else
			return "Manual " + transmission.getGears() + " gears";
	}
}

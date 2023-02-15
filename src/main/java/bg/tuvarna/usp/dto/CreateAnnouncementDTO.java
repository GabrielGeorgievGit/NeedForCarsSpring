package bg.tuvarna.usp.dto;

public class CreateAnnouncementDTO {
	private String title, contactName, contactNumber, brand, model, color, engine, description;
	private int announcementTypeId, cityId, carTypeId, drivetrainId, power, transmission, doors, weight, fuelId,
			displacement;
	private double price;

	public CreateAnnouncementDTO(String title, String contactName, String contactNumber, String brand, String model,
			String color, String engine, String description, int announcementTypeId, int cityId, int carTypeId,
			int drivetrainId, int power, int transmission, int doors, int weight, int fuelId, int displacement,
			double price) {
		super();
		this.title = title;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.engine = engine;
		this.description = description;
		this.announcementTypeId = announcementTypeId;
		this.cityId = cityId;
		this.carTypeId = carTypeId;
		this.drivetrainId = drivetrainId;
		this.power = power;
		this.transmission = transmission;
		this.doors = doors;
		this.weight = weight;
		this.fuelId = fuelId;
		this.displacement = displacement;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAnnouncementTypeId() {
		return announcementTypeId;
	}

	public void setAnnouncementTypeId(int typeId) {
		this.announcementTypeId = typeId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}

	public int getDrivetrainId() {
		return drivetrainId;
	}

	public void setDrivetrainId(int drivetrainId) {
		this.drivetrainId = drivetrainId;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getTransmission() {
		return transmission;
	}

	public void setTransmission(int transmission) {
		this.transmission = transmission;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFuelId() {
		return fuelId;
	}

	public void setFuelId(int fuelId) {
		this.fuelId = fuelId;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

}

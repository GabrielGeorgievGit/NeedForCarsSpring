package bg.tuvarna.usp.dto;

public class FilterAnnouncementDTO {
	private String carBrand, carModel;
	private Integer cityId, carTypeId;

	public FilterAnnouncementDTO(String carBrand, String carModel, Integer cityId, Integer carTypeId) {
		super();
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.cityId = cityId;
		this.carTypeId = carTypeId;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(Integer carTypeId) {
		this.carTypeId = carTypeId;
	}

}

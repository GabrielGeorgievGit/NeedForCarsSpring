package bg.tuvarna.usp.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "announcement")
public class Announcement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_announcement")
	private int id;
	@Column(name = "id_user")
	private int userId;
	@Column(name = "title")
	private String title;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "announcement_type") // , referencedColumnName = "id_type")
	private AnnouncementType announcementType;

	@Column(name = "contact_name")
	private String contactName;
	@Column(name = "contact_number")
	private String contactPhone;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_city") // , referencedColumnName = "id_city")
	private City city;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_car_description")
	private CarDescription carDescription;

	@Column(name = "price")
	private double price;

//	private String cityName = null;
//	private String announcementName = null;

	public Announcement() {

	}

	public void setAnnouncement(int userId, String title, AnnouncementType announcementType, String contactName,
			String contactPhone, City city, CarDescription carDescription, double price) {
		this.userId = userId;
		this.title = title;
		this.announcementType = announcementType;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.city = city;
		this.carDescription = carDescription;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AnnouncementType getAnnouncementType() {
		return announcementType;
	}

	public void setAnnouncementType(AnnouncementType announcementType) {
		this.announcementType = announcementType;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public CarDescription getCarDescription() {
		return carDescription;
	}

	public void setCarDescription(CarDescription carDescription) {
		this.carDescription = carDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

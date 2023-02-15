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
@Table(name = "announcement_type")
public class AnnouncementType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type")
	private int idType;

	private String name;
//	@Column(name="name")
	@OneToMany(mappedBy = "announcementType")
	private List<Announcement> announcements;

	public AnnouncementType() {

	}

	public AnnouncementType(String name) {
		super();
		this.name = name;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Announcement> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(List<Announcement> announcements) {
		this.announcements = announcements;
	}
}

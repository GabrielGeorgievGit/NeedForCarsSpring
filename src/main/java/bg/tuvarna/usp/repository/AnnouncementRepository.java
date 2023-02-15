package bg.tuvarna.usp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bg.tuvarna.usp.entity.Announcement;
import bg.tuvarna.usp.entity.AnnouncementType;
import bg.tuvarna.usp.entity.CarDescription;
import bg.tuvarna.usp.entity.CarDrivetrain;
import bg.tuvarna.usp.entity.CarFuel;
import bg.tuvarna.usp.entity.CarTransmission;
import bg.tuvarna.usp.entity.CarType;
import bg.tuvarna.usp.entity.City;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class AnnouncementRepository {

	@Autowired
	private EntityManager em;

	@Autowired
	private ObviousRepository or;

	public List<Announcement> getAnnouncements() {
		List<Announcement> list = null;
		try {
			list = em.createQuery("select a from Announcement a", Announcement.class).getResultList();
		} catch (Exception e) {
			System.out.println("error:");
			e.printStackTrace();
		}
		return list;
	}

	public List<Announcement> filterAnnouncements(String carBrand, String carModel, Integer cityId, Integer carTypeId) {
		// System.out.println("data: " + carBrand + carModel + cityId + carTypeId);
		List<Announcement> list = null;
		try {
			list = em
					.createQuery("select a from Announcement a, CarDescription d, City c, CarType t "
							+ "where a.carDescription = d and a.city = c and a.announcementType = t"
							+ " and d.brand = :brand and d.model = :model"
							+ " and c.id = :cityId and t.id = :carTypeId", Announcement.class)
					.setParameter("brand", carBrand).setParameter("model", carModel).setParameter("cityId", cityId)
					.setParameter("carTypeId", carTypeId).getResultList();
			// System.out.println("filter announcements size: " + list.size());
			// System.out.println(list.get(0));
		} catch (Exception e) {
			System.out.println("error:");
			e.printStackTrace();
		}
		return list;
	}

	@Transactional
	public Announcement createAnnouncement(String title, int announcementTypeId, String contactName,
			String contactNumber, int cityId, int carTypeId, String brand, String model, int drivetrainId, String color,
			int power, int transmissionId, String engine, int doors, int weight, int fuelId, int displacement,
			String description, double price) {
		CarType carType = or.findCarType(carTypeId);
		City city = or.findCity(cityId);
		CarFuel fuel = or.findCarFuel(fuelId);
		CarDrivetrain drivetrain = or.findCarDrivetrain(drivetrainId);
		AnnouncementType announcementType = findAnnouncementType(announcementTypeId);
		CarTransmission transmission = or.findCarTransmission(transmissionId);
		
		CarDescription carDescription = new CarDescription();
		carDescription.setCarDescription(carType, brand, model, drivetrain, color, power,
				transmission, engine, doors, weight, fuel, displacement, description);
		Announcement announcement = new Announcement();
		announcement.setAnnouncement(1, title, announcementType, contactName, contactNumber, city, carDescription, price);
		
		em.persist(announcement);
		
		return announcement;
	}

	public Announcement getAnnouncement(Integer id) {
		return em.find(Announcement.class, id);
	}

	public List<AnnouncementType> getAnnouncementTypes() {
		return em.createQuery("select s from AnnouncementType s order by s.idType", AnnouncementType.class)
				.getResultList();
	}

	public AnnouncementType findAnnouncementType(int idType) {
		return em.createQuery("select t from AnnouncementType t where t.id = :id", AnnouncementType.class)
				.setParameter("id", Integer.valueOf(idType)).getSingleResult();
	}

}

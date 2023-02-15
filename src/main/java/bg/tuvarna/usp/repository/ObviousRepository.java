package bg.tuvarna.usp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bg.tuvarna.usp.entity.CarDrivetrain;
import bg.tuvarna.usp.entity.CarFuel;
import bg.tuvarna.usp.entity.CarTransmission;
import bg.tuvarna.usp.entity.CarType;
import bg.tuvarna.usp.entity.City;
import jakarta.persistence.EntityManager;

@Repository
public class ObviousRepository {

	@Autowired
	private EntityManager em;

	public List<City> getCities() {
		return em.createQuery("select e from City e", City.class).getResultList();
	}

	public List<CarType> getAllCarTypes() {
		return em.createQuery("select t from CarType t", CarType.class).getResultList();
	}

	public List<CarDrivetrain> getAllCarDrivetrains() {
		return em.createQuery("select d from CarDrivetrain d", CarDrivetrain.class).getResultList();
	}

	public List<CarFuel> getAllCarFuels() {
		return em.createQuery("select f from CarFuel f", CarFuel.class).getResultList();
	}

	public List<CarTransmission> getAllCarTransmissions() {
		return em.createQuery("select t from CarTransmission t", CarTransmission.class).getResultList();
	}

	public City findCity(int idCity) {
		return em.createQuery("select c from City c where c.id = :id", City.class)
				.setParameter("id", Integer.valueOf(idCity)).getSingleResult();
	}

	public CarType findCarType(int idcarType) {
		return em.createQuery("select t from CarType t where t.id = :id", CarType.class)
				.setParameter("id", Integer.valueOf(idcarType)).getSingleResult();
	}
	
	public CarTransmission findCarTransmission(int idcarTransmission) {
		return em.createQuery("select t from CarTransmission t where t.gears = :id", CarTransmission.class)
				.setParameter("id", Integer.valueOf(idcarTransmission)).getSingleResult();
	}

	public CarFuel findCarFuel(int idCarFuel) {
		return em.createQuery("select f from CarFuel f where f.idFuel = :id", CarFuel.class)
				.setParameter("id", Integer.valueOf(idCarFuel)).getSingleResult();
	}

	public CarDrivetrain findCarDrivetrain(int idCarDrivetrain) {
		return em.createQuery("select d from CarDrivetrain d where d.id = :id", CarDrivetrain.class)
				.setParameter("id", Integer.valueOf(idCarDrivetrain)).getSingleResult();
	}

}

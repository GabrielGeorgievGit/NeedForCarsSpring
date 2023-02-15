package bg.tuvarna.usp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.tuvarna.usp.entity.CarDrivetrain;
import bg.tuvarna.usp.entity.CarFuel;
import bg.tuvarna.usp.entity.CarType;
import bg.tuvarna.usp.entity.City;
import bg.tuvarna.usp.repository.ObviousRepository;

@Service
public class ObviousService {
	
	@Autowired
	private ObviousRepository or;
	
	public List<City> getAllCities() {
		return or.getCities();
	}
	
	public List<CarType> getAllCarTypes() {
		return or.getAllCarTypes();
	}
	
	public List<CarDrivetrain> getAllCarDrivetrains() {
		return or.getAllCarDrivetrains();
	}
	
	public List<CarFuel> getAllCarFuels() {
		return or.getAllCarFuels();
	}
}

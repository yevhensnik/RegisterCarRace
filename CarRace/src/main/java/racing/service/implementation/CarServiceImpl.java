package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.CarDao;
import racing.domain.Car;
import racing.service.CarService;

@Service
public class CarServiceImpl implements CarService{
	

	@Autowired
	private CarDao dao;
	
	public void insertCar(String licensePlate, double engineCapacity, int yearCar) {
		Car a = new Car(licensePlate, engineCapacity, yearCar);
		dao.insertCar(a);
	}
	
	public void editCar(String licensePlate, double engineCapacity, int yearCar) {
		
	}
	
	public void deleteCar(String licensePlate, double engineCapacity, int yearCar) {
		
	}


	public List<Car> getAllCars() {
		return dao.getAllCars();
	}

	public Car findByLicensePlate(String licensePlate) {
		
		return dao.findByLicensePlate(licensePlate);
	}
	
	public List<Car> findByEngineCapacityPeriod(int from, int till) {
		// TODO Auto-generated method stub
		return dao.findByEngineCapacityPeriod(from, till);
	}
	
	public List<Car> findByYearPeriod(int from, int till) {
		// TODO Auto-generated method stub
		return dao.findByYearPeriod(from, till);
	}

}

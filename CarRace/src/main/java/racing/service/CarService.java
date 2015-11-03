package racing.service;

import java.util.List;

import racing.domain.Car;


public interface CarService {
	
	void insertCar(String licensePlate, double engineCapacity, int yearCar);

	void editCar(String licensePlate, double engineCapacity, int yearCar);

	void deleteCar(String licensePlate, double engineCapacity, int yearCar);

	List<Car> getAllCars();
	
	Car findByLicensePlate(String licensePlate);
	
	List<Car> findByEngineCapacityPeriod(int from, int till);
	
	List<Car> findByYearPeriod(int from, int till);
	


}

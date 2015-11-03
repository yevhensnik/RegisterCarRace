package racing.dao;

import java.util.List;



import racing.domain.Car;

public interface CarDao {
	
	void insertCar(Car car);

	void editCar(Car car);

	void deleteCar(Car car);

	List<Car> getAllCars();
	
	Car findByLicensePlate(String licensePlate);
	
	List<Car> findByEngineCapacityPeriod(int from, int till);
	
	List<Car> findByYearPeriod(int from, int till);


}

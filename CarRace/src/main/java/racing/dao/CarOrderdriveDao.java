package racing.dao;

import java.util.List;

import racing.domain.CarOrderdrive;

public interface CarOrderdriveDao {
	
	void insertCarOrderdrive(CarOrderdrive carorderdrive);

	void editCarOrderdrive(CarOrderdrive carorderdrive);

	void deleteCarOrderdrive(CarOrderdrive carorderdrive);

	List<CarOrderdrive> getAllCarOrderdrives();
	
	CarOrderdrive findByName(String name);


}

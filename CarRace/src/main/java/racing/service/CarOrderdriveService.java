package racing.service;

import java.util.List;

import racing.domain.CarOrderdrive;

public interface CarOrderdriveService {
	
	void insertCarOrderdrive(String name);

	void editCarOrderdrive(String name);

	void deleteCarOrderdrive(String name);

	List<CarOrderdrive> getAllCarOrderdrives();
	
	CarOrderdrive findByName(String name);


}

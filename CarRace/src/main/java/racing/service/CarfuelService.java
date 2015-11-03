package racing.service;

import java.util.List;

import racing.domain.Carfuel;

public interface CarfuelService {
	
	void insertCarfuel(String name);

	void editCarfuel(String name);

	void deleteCarfuel(String name);

	List<Carfuel> getAllCarfuels();

	Carfuel findByName(String name);

}

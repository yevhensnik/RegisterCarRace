package racing.service;

import java.util.List;

import racing.domain.City;

public interface CityService {

	void insertCity(String name);

	void editCity(String name);
	
	void deleteCity(String name);

	List<City> getAllCitys();
	
	City findByName(String name);

}

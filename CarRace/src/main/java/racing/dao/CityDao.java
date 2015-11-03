package racing.dao;

import java.util.List;

import racing.domain.City;

public interface CityDao {

	void insertCity(City city);

	void editCity(City city);

	void deleteCity(City city);

	List<City> getAllCitys();

	City findByName(String name);

}

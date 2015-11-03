package racing.service;

import java.util.List;

import racing.domain.Carbody;



public interface CarbodyService {
	
	void insertCarbody(String name);

	void editCarbody(String name);

	void deleteCarbody(String name);

	List<Carbody> getAllCarbodys();

	Carbody findByName(String name);

}

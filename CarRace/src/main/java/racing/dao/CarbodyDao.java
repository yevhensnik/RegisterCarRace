package racing.dao;

import java.util.List;

import racing.domain.Carbody;



public interface CarbodyDao {
	
	void insertCarbody(Carbody carbody);

	void editCarbody(Carbody carbody);

	void deleteCarbody(Carbody carbody);

	List<Carbody> getAllCarbodys();
	
	Carbody findByName(String name);


}

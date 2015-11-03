package racing.dao;

import java.util.List;

import racing.domain.Carfuel;

public interface CarfuelDao {
	
	void insertCarfuel(Carfuel carfuel);

	void editCarfuel(Carfuel carfuel);

	void deleteCarfuel(Carfuel carfuel);

	List<Carfuel> getAllCarfuels();
	
	Carfuel findByName(String name);


}

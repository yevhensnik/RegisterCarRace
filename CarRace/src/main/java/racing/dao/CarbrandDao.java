package racing.dao;

import java.util.List;



import racing.domain.Carbrand;

public interface CarbrandDao {
	
	void insertCarbrand(Carbrand carbrand);

	void editCarbrand(Carbrand carbrand);

	void deleteCarbrand(Carbrand carbrand);

	List<Carbrand> getAllCarbrands();

	Carbrand findByName(String name);


}

package racing.service;

import java.util.List;






import racing.domain.Carbrand;

public interface CarbrandService {
	
	void insertCarbrand(String name);

	void editCarbrand(String name);

	void deleteCarbrand(String name);

	List<Carbrand> getAllCarbrands();

	Carbrand findByName(String name);

}

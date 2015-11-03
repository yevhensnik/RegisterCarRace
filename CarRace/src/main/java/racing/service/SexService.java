package racing.service;

import java.util.List;

import racing.domain.Sex;

public interface SexService {
	
	void insertSex(String name);

	void editSex(String name);
	
	void deleteSex(String name);

	List<Sex> getAllSexs();
	
	Sex findByName(String name);


}

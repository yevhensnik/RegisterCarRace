package racing.dao;

import java.util.List;

import racing.domain.Sex;

public interface SexDao {
	
	void insertSex(Sex sex);

	void editSex(Sex sex);

	void deleteSex(Sex sex);

	List<Sex> getAllSexs();
	
	Sex findByName(String name);


}

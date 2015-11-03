package racing.dao;

import java.util.List;

import racing.domain.Carstyle;

public interface CarstyleDao {
	
	void insertCarstyle(Carstyle carstyle);

	void editCarstyle(Carstyle carstyle);

	void deleteCarstyle(Carstyle carstyle);

	List<Carstyle> getAllCarstyles();

	Carstyle findByName(String name);

}

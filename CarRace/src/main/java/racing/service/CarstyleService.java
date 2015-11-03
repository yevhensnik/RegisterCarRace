package racing.service;

import java.util.List;

import racing.domain.Carstyle;

public interface CarstyleService {
	
	void insertCarstyle(String name);

	void editCarstyle(String name);

	void deleteCarstyle(String name);

	List<Carstyle> getAllCarstyles();

	Carstyle findByName(String name);

}

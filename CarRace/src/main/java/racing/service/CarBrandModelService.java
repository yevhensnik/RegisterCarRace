package racing.service;

import java.util.List;






import racing.domain.CarBrandModel;

public interface CarBrandModelService {
	
	void insertCarBrandModel(String name);

	void editCarBrandModel(String name);

	void deleteCarBrandModel(String name);

	List<CarBrandModel> getAllCarBrandModels();

	CarBrandModel findByName(String name);

}

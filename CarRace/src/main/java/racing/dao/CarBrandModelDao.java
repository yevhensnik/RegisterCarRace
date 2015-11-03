package racing.dao;

import java.util.List;



import racing.domain.CarBrandModel;

public interface CarBrandModelDao {
	
	void insertCarBrandModel(CarBrandModel carbrandmodel);

	void editCarBrandModel(CarBrandModel carbrandmodel);

	void deleteCarBrandModel(CarBrandModel carbrandmodel);

	List<CarBrandModel> getAllCarBrandModels();

	CarBrandModel findByName(String name);

}

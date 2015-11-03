package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.CarBrandModelDao;
import racing.domain.CarBrandModel;
import racing.service.CarBrandModelService;

@Service
public class CarBrandModelServiceImpl implements CarBrandModelService{
	

	@Autowired
	private CarBrandModelDao dao;
	
	public void insertCarBrandModel(String name) {
		CarBrandModel a = new CarBrandModel(name);
		dao.insertCarBrandModel(a);
	}
	
	public void editCarBrandModel(String name) {
		
	}
	
	public void deleteCarBrandModel(String name) {
		
	}


	public List<CarBrandModel> getAllCarBrandModels() {
		return dao.getAllCarBrandModels();
	}

	public CarBrandModel findByName(String name) {
		
		return dao.findByName(name);
	}

}

package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.CarOrderdriveDao;
import racing.domain.CarOrderdrive;
import racing.service.CarOrderdriveService;

@Service
public class CarOrderdriveServiceImpl implements CarOrderdriveService{
	

	@Autowired
	private CarOrderdriveDao dao;
	
	public void insertCarOrderdrive(String name) {
		CarOrderdrive a = new CarOrderdrive(name);
		dao.insertCarOrderdrive(a);
	}
	
	public void editCarOrderdrive(String name) {
		
	}
	
	public void deleteCarOrderdrive(String name) {
		
	}


	public List<CarOrderdrive> getAllCarOrderdrives() {
		return dao.getAllCarOrderdrives();
	}

	public CarOrderdrive findByName(String name) {
		
		return dao.findByName(name);
	}

}

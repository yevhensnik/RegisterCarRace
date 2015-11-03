package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.CarfuelDao;
import racing.domain.Carfuel;
import racing.service.CarfuelService;

@Service
public class CarfuelServiceImpl implements CarfuelService{


	@Autowired
	private CarfuelDao dao;
	
	public void insertCarfuel(String name) {
		Carfuel a = new Carfuel(name);
		dao.insertCarfuel(a);
	}
	
	public void editCarfuel(String name) {
		
	}
	
	public void deleteCarfuel(String name) {
		
	}


	public List<Carfuel> getAllCarfuels() {
		return dao.getAllCarfuels();
	}

	public Carfuel findByName(String name) {
		
		return dao.findByName(name);
	}
}

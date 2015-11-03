package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.CarstyleDao;
import racing.domain.Carstyle;
import racing.service.CarstyleService;

@Service
public class CarstyleServiceImpl implements CarstyleService {
	

	@Autowired
	private CarstyleDao dao;
	
	public void insertCarstyle(String name) {
		Carstyle a = new Carstyle(name);
		dao.insertCarstyle(a);
	}
	
	public void editCarstyle(String name) {
		
	}
	
	public void deleteCarstyle(String name) {
		
	}


	public List<Carstyle> getAllCarstyles() {
		return dao.getAllCarstyles();
	}

	public Carstyle findByName(String name) {
		
		return dao.findByName(name);
	}


}

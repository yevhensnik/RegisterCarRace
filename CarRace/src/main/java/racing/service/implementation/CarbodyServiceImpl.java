package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.CarbodyDao;
import racing.domain.Carbody;
import racing.service.CarbodyService;

@Service
public class CarbodyServiceImpl implements CarbodyService{
	

	@Autowired
	private CarbodyDao dao;
	
	public void insertCarbody(String name) {
		Carbody a = new Carbody(name);
		dao.insertCarbody(a);
	}
	
	public void editCarbody(String name) {
		
	}
	
	public void deleteCarbody(String name) {
		
	}


	public List<Carbody> getAllCarbodys() {
		return dao.getAllCarbodys();
	}

	public Carbody findByName(String name) {
		
		return dao.findByName(name);
	}

}

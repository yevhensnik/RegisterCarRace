package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.CarbrandDao;
import racing.domain.Carbrand;
import racing.service.CarbrandService;


@Service
public class CarbrandServiceImpl implements CarbrandService{
	

	@Autowired
	private CarbrandDao dao;
	
	public void insertCarbrand(String name) {
		Carbrand a = new Carbrand(name);
		dao.insertCarbrand(a);
	}
	
	public void editCarbrand(String name) {
		
	}
	
	public void deleteCarbrand(String name) {
		
	}


	public List<Carbrand> getAllCarbrands() {
		return dao.getAllCarbrands();
	}

	public Carbrand findByName(String name) {
		
		return dao.findByName(name);
	}

}

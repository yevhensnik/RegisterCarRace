package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.SexDao;
import racing.domain.Sex;
import racing.service.SexService;

@Service
public class SexServiceImpl implements SexService{
	

	@Autowired
	private SexDao dao;
	
	public void insertSex(String name) {
		Sex a = new Sex(name);
		dao.insertSex(a);
	}
	
	public void editSex(String name) {
		
	}
	
	public void deleteSex(String name) {
		
	}


	public List<Sex> getAllSexs() {
		return dao.getAllSexs();
	}

	public Sex findByName(String name) {
		
		return dao.findByName(name);
	}


}

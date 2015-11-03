package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.ClubmanDao;
import racing.domain.Clubman;
import racing.service.ClubmanService;

@Service
public class ClubmanServiceImpl implements ClubmanService {
	
	@Autowired
	private ClubmanDao dao;
	
	public void insertClubman(String name, String dateofbirdth, String nickname) {
		Clubman a = new Clubman(name, dateofbirdth, nickname);
		dao.insertClubman(a);

	}

	public void insertCm(Clubman clubman) {
		// TODO Auto-generated method stub
		
		dao.insertClubman(clubman);
	}
	
	public void editClubman(String name, String dateofbirdth, String nickname) {

	}
	public void deleteClubman(String name, String dateofbirdth, String nickname) {

	}
	

	public List<Clubman> getAllClubmans() {
		
		return dao.getAllClubmans();
	}

	public Clubman findByName(String name) {
		
		return dao.findByName(name);
	}
	
	public Clubman findByNickName(String nickname) {
		
		return dao.findByNickName(nickname);
	}

	
	
	

}

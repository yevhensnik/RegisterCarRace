package racing.service;

import java.util.List;

import racing.domain.Clubman;

public interface ClubmanService {
	void insertClubman(String name, String dateofbirdth, String nickname);
	
	void insertCm(Clubman clubman);

	void editClubman(String name, String dateofbirdth, String nickname);

	void deleteClubman(String name, String dateofbirdth, String nickname);

	List<Clubman> getAllClubmans();
	
	Clubman findByName(String name);
	
	Clubman findByNickName(String nickname);
	

	
	

}

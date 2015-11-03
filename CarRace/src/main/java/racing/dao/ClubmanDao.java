package racing.dao;

import java.util.List;

import racing.domain.Clubman;


public interface ClubmanDao {
	
	void insertClubman(Clubman clubman);

	void insertCm(Clubman clubman);

	
	void editClubman(Clubman clubman);

	void deleteClubman(Clubman clubman);

	List<Clubman> getAllClubmans();

	Clubman findByName(String name);
	
	Clubman findByNickName(String nickname);
	
	
	
}

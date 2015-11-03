package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.ClubmanDao;
import racing.domain.Clubman;


@Repository
public class ClubmanDaoImpl implements ClubmanDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertClubman(Clubman clubman) {
		em.persist(clubman);
		
	}
	
	public void insertCm(Clubman clubman) {
		// TODO Auto-generated method stub
		em.persist(clubman);
	}
	
	@Transactional
	public void editClubman(Clubman clubman) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteClubman(Clubman clubman) {
		em.remove(clubman);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Clubman> getAllClubmans() {
		
		return em.createQuery("from Clubman").getResultList();
	}
	
	public Clubman findByName(String name) {
		// TODO Auto-generated method stub
		return (Clubman) em.createNamedQuery("Clubman.findByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}
	
	public Clubman findByNickName(String name) {
		// TODO Auto-generated method stub
		return (Clubman) em.createNamedQuery("Clubman.findByNickName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}

	
	
	


}

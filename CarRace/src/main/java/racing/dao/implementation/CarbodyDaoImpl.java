package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.CarbodyDao;
import racing.domain.Carbody;



@Repository
public class CarbodyDaoImpl implements CarbodyDao {

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertCarbody(Carbody carbody) {
		em.persist(carbody);
		
	}
	
	@Transactional
	public void editCarbody(Carbody carbody) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCarbody(Carbody carbody) {
		em.remove(carbody);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Carbody> getAllCarbodys() {
		
		return em.createQuery("from Carbody").getResultList();
	}
	
	public Carbody findByName(String name) {
		// TODO Auto-generated method stub
		return (Carbody) em.createNamedQuery("Carbody.FindByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}
	


}

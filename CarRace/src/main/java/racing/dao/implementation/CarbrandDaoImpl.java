package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.CarbrandDao;
import racing.domain.Carbrand;

@Repository
public class CarbrandDaoImpl implements CarbrandDao {

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertCarbrand(Carbrand carbrand) {
		em.persist(carbrand);
		
	}
	
	@Transactional
	public void editCarbrand(Carbrand carbrand) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCarbrand(Carbrand carbrand) {
		em.remove(carbrand);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Carbrand> getAllCarbrands() {
		
		return em.createQuery("from Carbrand").getResultList();
	}
	
	public Carbrand findByName(String name) {
		// TODO Auto-generated method stub
		return (Carbrand) em.createNamedQuery("Carbrand.FindByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}
	

}

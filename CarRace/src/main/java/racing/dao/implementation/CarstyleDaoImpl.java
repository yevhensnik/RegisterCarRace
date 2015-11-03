package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.CarstyleDao;
import racing.domain.Carstyle;

@Repository
public class CarstyleDaoImpl implements CarstyleDao{
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertCarstyle(Carstyle carstyle) {
		em.persist(carstyle);
		
	}
	
	@Transactional
	public void editCarstyle(Carstyle carstyle) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCarstyle(Carstyle carstyle) {
		em.remove(carstyle);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Carstyle> getAllCarstyles() {
		
		return em.createQuery("from Carstyle").getResultList();
	}
	
	public Carstyle findByName(String name) {
		// TODO Auto-generated method stub
		return (Carstyle) em.createNamedQuery("Carstyle.findByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}
	

}

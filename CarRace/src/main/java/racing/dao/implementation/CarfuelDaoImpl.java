package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.CarfuelDao;
import racing.domain.Carfuel;

@Repository
public class CarfuelDaoImpl implements CarfuelDao{
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertCarfuel(Carfuel carfuel) {
		em.persist(carfuel);
		
	}
	
	@Transactional
	public void editCarfuel(Carfuel carfuel) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCarfuel(Carfuel carfuel) {
		em.remove(carfuel);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Carfuel> getAllCarfuels() {
		
		return em.createQuery("from Carfuel").getResultList();
	}
	
	
	public Carfuel findByName(String name) {
		// TODO Auto-generated method stub
		return (Carfuel) em.createNamedQuery("Carfuel.findByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}

}

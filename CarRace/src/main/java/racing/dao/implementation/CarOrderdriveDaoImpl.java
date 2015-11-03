package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.CarOrderdriveDao;
import racing.domain.CarOrderdrive;

@Repository
public class CarOrderdriveDaoImpl implements CarOrderdriveDao{
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertCarOrderdrive(CarOrderdrive carorderdrive) {
		em.persist(carorderdrive);
		
	}
	
	@Transactional
	public void editCarOrderdrive(CarOrderdrive carorderdrive) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCarOrderdrive(CarOrderdrive carorderdrive) {
		em.remove(carorderdrive);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarOrderdrive> getAllCarOrderdrives() {
		
		return em.createQuery("from CarOrderdrive").getResultList();
	}
	
	public CarOrderdrive findByName(String name) {
		// TODO Auto-generated method stub
		return (CarOrderdrive) em.createNamedQuery("CarOrderdrive.findByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}
	

}

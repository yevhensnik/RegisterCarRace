package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.ApplicationDao;
import racing.domain.Application;
import racing.domain.Car;

@Repository
public class ApplicationDaoImpl implements ApplicationDao{
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertApplication(Application application) {
		em.persist(application);
		
	}
	
	
	public void insertApp(Application application) {
		// TODO Auto-generated method stub
		em.persist(application);
	}
	
	@Transactional
	public void editApplication(Application application) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteApplication(Application application) {
		em.remove(application);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Application> getAllApplications() {
		
		return em.createQuery("from Application").getResultList();
	}
	
	public List<Application> findByIdPeriod(int from, int till) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Application.findByIdPeriod").setParameter("from", from).setParameter("till", till).getResultList();
	}

	


}

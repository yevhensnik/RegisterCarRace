package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.SexDao;
import racing.domain.Sex;

@Repository
public class SexDaoImpl implements SexDao {


	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertSex(Sex sex) {
		em.persist(sex);
		
	}
	
	@Transactional
	public void editSex(Sex sex) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteSex(Sex sex) {
		em.remove(sex);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Sex> getAllSexs() {
		
		return em.createQuery("from Sex").getResultList();
	}
	
	public Sex findByName(String name) {
		// TODO Auto-generated method stub
		return (Sex) em.createNamedQuery("Sex.findByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}
	


}

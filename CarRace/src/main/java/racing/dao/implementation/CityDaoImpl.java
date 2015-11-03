package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.CityDao;
import racing.domain.City;

@Repository
public class CityDaoImpl implements CityDao{
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertCity(City city) {
		em.persist(city);
		
	}
	
	@Transactional
	public void editCity(City city) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCity(City city) {
		em.remove(city);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<City> getAllCitys() {
		
		return em.createQuery("from City").getResultList();
	}
	
	public City findByName(String name) {
		// TODO Auto-generated method stub
		return (City) em.createNamedQuery("City.findByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}
	

}

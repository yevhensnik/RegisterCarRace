package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.CarBrandModelDao;
import racing.domain.CarBrandModel;



@Repository
public class CarBrandModelDaoImpl implements CarBrandModelDao{
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertCarBrandModel(CarBrandModel carbrandmodel) {
		em.persist(carbrandmodel);
		
	}
	
	@Transactional
	public void editCarBrandModel(CarBrandModel carbrandmodel) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCarBrandModel(CarBrandModel carbrandmodel) {
		em.persist(carbrandmodel);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarBrandModel> getAllCarBrandModels() {
		
		return em.createQuery("from CarBrandModel").getResultList();
	}
	
	public CarBrandModel findByName(String name) {
		// TODO Auto-generated method stub
		return (CarBrandModel) em.createNamedQuery("CarBrandModel.FindByName")
				.setParameter("name", name).setMaxResults(1).getSingleResult();
	}
	

}

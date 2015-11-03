package racing.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.CarDao;
import racing.domain.Car;

@Repository
public class CarDaoImpl implements CarDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	@Transactional
	public void insertCar(Car car) {
		em.persist(car);
		
	}
	
	@Transactional
	public void editCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCar(Car car) {
		em.remove(car);
		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Car> getAllCars() {
		
		return em.createQuery("from Car").getResultList();
	}
	
	
	public Car findByLicensePlate(String licensePlate) {
		// TODO Auto-generated method stub
		return (Car) em.createNamedQuery("Car.findByLicensePlate")
				.setParameter("licensePlate", licensePlate).setMaxResults(1).getSingleResult();
	}
	
	
	public List<Car> findByEngineCapacityPeriod(int from, int till) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Car.FindByAgePeriod").setParameter("from", from).setParameter("till", till).getResultList();
	}
	
	public List<Car> findByYearPeriod(int from, int till) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Car.FindByAgePeriod")
				.setParameter("from", from).setParameter("till", till)
				.getResultList();
	}


}

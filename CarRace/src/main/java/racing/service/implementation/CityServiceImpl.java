package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import racing.dao.CityDao;
import racing.domain.City;
import racing.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	
		
		@Autowired
		private CityDao dao;
		
		public void insertCity(String name) {
			City a = new City(name);
			dao.insertCity(a);
		}
		
		public void editCity(String name) {
			
		}
		
		public void deleteCity(String name) {
			
		}


		public List<City> getAllCitys() {
			return dao.getAllCitys();
		}

		public City findByName(String name) {
			
			return dao.findByName(name);
		}

}

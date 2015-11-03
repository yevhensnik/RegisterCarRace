package racing.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import racing.dao.ApplicationDao;
import racing.dao.CarBrandModelDao;
import racing.dao.CarDao;
import racing.dao.CarOrderdriveDao;
import racing.dao.CarbodyDao;
import racing.dao.CarbrandDao;
import racing.dao.CarfuelDao;
import racing.dao.CarstyleDao;
import racing.dao.CityDao;
import racing.dao.ClubmanDao;
import racing.dao.SexDao;
import racing.domain.Application;
import racing.domain.Car;
import racing.domain.CarBrandModel;
import racing.domain.CarOrderdrive;
import racing.domain.Carbody;
import racing.domain.Carbrand;
import racing.domain.Carfuel;
import racing.domain.Carstyle;
import racing.domain.City;
import racing.domain.Clubman;
import racing.domain.Sex;
import racing.service.ApplicationService;


@Service
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	private ApplicationDao applicationDao;
	private SexDao sexDao;
	private CityDao cityDao;
	private ClubmanDao clubmanDao;
	private CarbrandDao carbrandDao;
	private CarBrandModelDao carbrandmodelDao;
	private CarstyleDao carstyleDao;
	private CarOrderdriveDao carorderdriveDao;
	private CarfuelDao carfuelDao;
	private CarDao carDao;
	private CarbodyDao carbodyDao;
	
	public void insertApplication(String moreinfo) {
		Application a = new Application(moreinfo);
		applicationDao.insertApplication(a);
	}
	
	@Transactional
	public void insertApp(String name, String dateofbirdth, String username, String cityName, String sexName,
			String licensePlate, double engineCapacity, int carYear, String carBrand, String carBrandModel,
			String carStyle, String carBody, String carFuel, String carOrderDrive, String moreInfo) {
		
			CarBrandModel brandModel = carbrandmodelDao.findByName(carBrandModel);
			if (brandModel == null){
				brandModel = new CarBrandModel();
				brandModel.setName(carBrandModel);
				carbrandmodelDao.insertCarBrandModel(brandModel);
			}
			Carbrand brand = carbrandDao.findByName(carBrand);
			if(brand != null){
				brand = new Carbrand();
				brand.setName(carBrand);
				brand.setCarbrandmodel(brandModel);
				carbrandDao.insertCarbrand(brand);
			}
			
			Carbody body = carbodyDao.findByName(carBody);
			if(body == null){
				body = new Carbody();
				body.setName(carBody);
				carbodyDao.insertCarbody(body);
			}
			Carfuel fuel = carfuelDao.findByName(carFuel);
			if(fuel == null){
				fuel = new Carfuel();
				fuel.setName(carFuel);
				carfuelDao.insertCarfuel(fuel);
			}
			CarOrderdrive orderDrive = carorderdriveDao.findByName(carOrderDrive);
			if(orderDrive == null){
				orderDrive = new CarOrderdrive();
				orderDrive.setName(carOrderDrive);
				carorderdriveDao.insertCarOrderdrive(orderDrive);
			}
			
			Carstyle style = carstyleDao.findByName(carStyle);
			if(style == null){
				style = new Carstyle(carStyle);
//				style.setName(carStyle);
				carstyleDao.insertCarstyle(style);
			}
			
			Car car = carDao.findByLicensePlate(licensePlate);
			if(car == null){
				car = new Car();
				car.setCarbody(body);
				car.setCarfuel(fuel);
				car.setCarorderdrive(orderDrive);
				car.setCarbrand(brand);
				carDao.insertCar(car);
			}
			
			
			City city = cityDao.findByName(cityName);
			if(city == null){
				city = new City();
				city.setName(cityName);
				cityDao.insertCity(city);
			}
			Sex sex = sexDao.findByName(sexName);
			if(sex == null){
				sex = new Sex();
				sex.setName(sexName);
				sexDao.insertSex(sex);
			}
			Clubman clubman = clubmanDao.findByNickName(username);
			if(clubman == null){
				clubman = new Clubman();
				clubman.setNickname(username);
				clubmanDao.insertCm(clubman);
			}
			
			
			
			
			
			
			
//			Carstyle style = carstyleDao.findByName(carStyle);
//			if(style == null){}
	
//		Application a = new Application(name, dateofbirdth, username, cityName, sexName, licensePlate, engineCapacity, carYear, carBrand, carBrandModel, carStyle, carBody, 
//				carFuel, carOrderDrive, moreInfo);
//		dao.insertApp(a);
	}
	
	
	
	
	public void editApplication(String moreinfo) {
		
	}
	
	public void deleteApplication(String moreinfo) {
		
	}


	public List<Application> getAllApplications() {
		return applicationDao.getAllApplications();
	}
	
	public List<Application> findByIdPeriod(int from, int till) {
		// TODO Auto-generated method stub
		return applicationDao.findByIdPeriod(from, till);
	}

	
	

	
}

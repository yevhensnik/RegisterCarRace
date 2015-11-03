package racing.service;

import java.util.List;

import racing.domain.Application;


public interface ApplicationService {
	
	void insertApplication(String moreinfo);
	
//	void insertApp(Application application);

	void editApplication(String moreinfo);

	void deleteApplication(String moreinfo);

	List<Application> getAllApplications();

	List<Application> findByIdPeriod(int from, int till);

	void insertApp(String name, String dateofbirdth, String username, String cityName, String sexName,
			String licensePlate, double engineCapacity, int carYear, String carBrand, String carBrandModel,
			String carStyle, String carBody, String carFuel, String carOrderDrive, String moreInfo);

}

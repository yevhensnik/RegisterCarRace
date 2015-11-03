package racing.dao;

import java.util.List;

import racing.domain.Application;

public interface ApplicationDao {
	
	void insertApplication(Application application);
	
	void insertApp(Application application);

	void editApplication(Application application);

	void deleteApplication(Application application);

	List<Application> getAllApplications();
	
	List<Application> findByIdPeriod(int from, int till);


}

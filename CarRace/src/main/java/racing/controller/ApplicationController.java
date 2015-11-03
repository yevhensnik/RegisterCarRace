package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.Application;
import racing.service.ApplicationService;


@Controller
public class ApplicationController {
	
	@Autowired
	private ApplicationService service;
	
	@RequestMapping(value = "/showAllApplications")
	public String getAllApplications(Model model){
		List<Application> applications = service.getAllApplications();
		model.addAttribute("allApplications", applications);
		return "application-all";
	}
	
	@RequestMapping(value = "/register")
	public String createApplicationPage(){
		return "register";
	}
	
	@RequestMapping(value = "/*")
	public String createIndexPage(){
		return "index";
	}

	///////////////////////
	
//	@RequestMapping(value = "/register")
//	private String showApplication(Model model) {
//		model.addAttribute("application", new Application());
//		model.addAttribute("applications", service.getAllApplications());
//		return "register";
//	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	private String showAllApplication(@RequestParam String name, @RequestParam String dateofbirdth, 
			@RequestParam String username, @RequestParam String cityName, @RequestParam String sexName, 
			@RequestParam String licensePlate, @RequestParam String engineCapacity, @RequestParam String carYear, 
			@RequestParam String carBrand, @RequestParam String carBrandModel, @RequestParam String carStyle, 
			@RequestParam String carBody, @RequestParam String carFuel, @RequestParam String carOrderDrive, 
			@RequestParam String moreInfo) {
			
			double engineCapacityDouble = Double.parseDouble(engineCapacity);
			int carYearInt = Integer.parseInt(carYear);
			service.insertApp(name, dateofbirdth, username, cityName, sexName, licensePlate,
					engineCapacityDouble, carYearInt, carBrand, carBrandModel, carStyle, carBody, 
					carFuel, carOrderDrive, moreInfo);
			return "redirect:/register.html";
		
	}
	
	///////////////////
	
	
	@RequestMapping(value = "/showAllApplications", method = RequestMethod.POST)
	public String createApplication(@RequestParam(value = "moreinfo") String moreinfo) {
		service.insertApplication(moreinfo);
		
		return "redirect:/showAllApplicationys";
	}
}



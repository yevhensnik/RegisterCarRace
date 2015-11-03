package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.Car;
import racing.service.CarService;


@Controller
public class CarController {
	
	@Autowired
	private CarService service;
	
	@RequestMapping(value = "/showAllCar")
	public String getAllCar(Model model){
		List<Car> cars = service.getAllCars();
		model.addAttribute("allCar", cars);
		return "car-all";
		
	}
	
	@RequestMapping(value = "/createCar")
	public String createCarPage(){
		return "car-new";
	}

	@RequestMapping(value = "/showAllCars", method = RequestMethod.POST)
	public String createCar(@RequestParam(value = "license_Plate") String licensePlate,
			@RequestParam(value = "engine_Capacity") String engineCapacity,
			@RequestParam(value = "year_Car") String yearCar) {
		int engineCapacityInt = Integer.parseInt(engineCapacity);
		int yearCarInt = Integer.parseInt(yearCar);
		service.insertCar(licensePlate, engineCapacityInt, yearCarInt);
	
		return "redirect:/showAllCars";
	}
}

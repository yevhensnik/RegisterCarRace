package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.City;
import racing.service.CityService;

@Controller
public class CityController {

	@Autowired
	private CityService service;
	
	@RequestMapping(value = "/showAllCitys")
	public String getAllCitys(Model model){
		List<City> citys = service.getAllCitys();
		model.addAttribute("allCitys", citys);
		return "city-all";
		
	}
	
	@RequestMapping(value = "/createCity")
	public String createCityPage(){
		return "city-new";
	}

	@RequestMapping(value = "/showAllCitys", method = RequestMethod.POST)
	public String createCity(@RequestParam(value = "name") String name) {
		service.insertCity(name);
		
		return "redirect:/showAllCitys";
	}
}

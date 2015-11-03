package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.Carfuel;
import racing.service.CarfuelService;

@Controller
	public class CarfuelController {
	@Autowired
	private CarfuelService service;
	
	@RequestMapping(value = "/showAllCarfuels")
	public String getAllCarfuels(Model model){
		List<Carfuel> сarfuels = service.getAllCarfuels();
		model.addAttribute("allCarfuels", сarfuels);
		return "сarfuel-all";
		
	}
	
	@RequestMapping(value = "/createCarfuel")
	public String createCarfuelPage(){
		return "сarfuel-new";
	}

	@RequestMapping(value = "/showAllCarfuels", method = RequestMethod.POST)
	public String createCarfuel(@RequestParam(value = "name") String name) {
		service.insertCarfuel(name);
	
		return "redirect:/showAllCarfuels";
	}
}

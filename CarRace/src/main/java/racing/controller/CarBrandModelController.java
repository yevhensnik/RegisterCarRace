package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.CarBrandModel;
import racing.service.CarBrandModelService;

@Controller
public class CarBrandModelController {

	@Autowired
	private CarBrandModelService service;
	
	@RequestMapping(value = "/showAllCarBrandModels")
	public String getAllCarBrandModels(Model model) {
		List<CarBrandModel> carBrandModels = service.getAllCarBrandModels();
		model.addAttribute("allCarBrandModels", carBrandModels);
		return "carBrandModel-all";
	}
	
	@RequestMapping(value = "/createCarBrandModel") 
	public String createCarBrandModelPage() {
		return "carBrandModel-new";
	}
	
	@RequestMapping(value = "/showAllCarBrandModels", method = RequestMethod.POST)
	public String createCarBrandModel(@RequestParam(value = "name") String name) {
		service.insertCarBrandModel(name);

		return "redirect:/showAllCarBrandModels";
	}
}

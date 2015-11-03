package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.Carbrand;
import racing.service.CarbrandService;


@Controller
public class CarbrandController {
	
	@Autowired
	private CarbrandService service;
	
	@RequestMapping(value = "/showAllCarbrands")
	public String getAllCarbrands(Model model) {
		List<Carbrand> carbrands = service.getAllCarbrands();
		model.addAttribute("allCarbrands", carbrands);
		return "carbrand-all";
	}
	
	@RequestMapping(value = "/createCarbrand") 
	public String createCarbrandPage() {
		return "carbrand-new";
	}
	
	@RequestMapping(value = "/showAllCarbrands", method = RequestMethod.POST)
	public String createCarbrand(@RequestParam(value = "name") String name) {

		return "redirect:/showAllCarbrands";
	}
}

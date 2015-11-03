package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.Carbody;
import racing.service.CarbodyService;


@Controller
public class CarbodyController {
	
	
	@Autowired
	private CarbodyService service;
	
	@RequestMapping(value = "/showAllCarbodys")
	public String getAllCarbodys(Model model){
		List<Carbody> carbodys = service.getAllCarbodys();
		model.addAttribute("allCarbodys", carbodys);
		return "carbody-all";
		
	}
	
	@RequestMapping(value = "/createCarbody")
	public String createCarbodyPage(){
		return "carbody-new";
	}

	@RequestMapping(value = "/showAllCarbodys", method = RequestMethod.POST)
	public String createCarbody(@RequestParam(value = "name") String name) {
		service.insertCarbody(name);
		
		return "redirect:/showAllCarbodys";
	}

}

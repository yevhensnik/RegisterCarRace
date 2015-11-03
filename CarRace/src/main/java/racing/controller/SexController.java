package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.Sex;
import racing.service.SexService;


@Controller
public class SexController {
	
	@Autowired
	private SexService service;
	
	@RequestMapping(value = "/showAllSexs")
	public String getAllSexs(Model model) {
		List<Sex> sexs = service.getAllSexs();
		model.addAttribute("allSexs", sexs);
		return "sex-all";
	}
	
	@RequestMapping(value = "/createSex") 
	public String createSexPage() {
		return "sex-new";
	}
	
	@RequestMapping(value = "/showAllSexs", method = RequestMethod.POST)
	public String createSex(@RequestParam(value = "name") String name) {
		service.insertSex(name);
		
		return "redirect:/showAllSexs";
	}

}

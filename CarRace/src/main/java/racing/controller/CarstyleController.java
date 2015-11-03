package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.Carstyle;
import racing.service.CarstyleService;

@Controller
	public class CarstyleController {
	
	@Autowired
	private CarstyleService service;
	
	@RequestMapping(value = "/showAllCarstyles")
	public String getAllCarstyles(Model model){
		List<Carstyle> сarstyles = service.getAllCarstyles();
		model.addAttribute("allCarstyles", сarstyles);
		return "сarstyle-all";
		
	}
	
	@RequestMapping(value = "/createCarstyle")
	public String createCarstylePage(){
		return "сarstyle-new";
	}

	@RequestMapping(value = "/showAllCarstyles", method = RequestMethod.POST)
	public String createCarstyle(@RequestParam(value = "name") String name) {
		service.insertCarstyle(name);
	
		return "redirect:/showAllCarstyles";
	}
}

package racing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.CarOrderdrive;
import racing.service.CarOrderdriveService;

@Controller
public class CarOrderdriveController {
	
	@Autowired
	private CarOrderdriveService service;
	
	@RequestMapping(value = "/showAllCarOrderdrives")
	public String getAllCarOrderdrives(Model model){
		List<CarOrderdrive> сarOrderdrives = service.getAllCarOrderdrives();
		model.addAttribute("allCarOrderdrives", сarOrderdrives);
		return "сarOrderdrive-all";
		
	}
	
	@RequestMapping(value = "/createCarOrderdrive")
	public String createCarOrderdrivePage(){
		return "сarOrderdrive-new";
	}

	@RequestMapping(value = "/showAllCarOrderdrives", method = RequestMethod.POST)
	public String createCarOrderdrive(@RequestParam(value = "name") String name) {
		service.insertCarOrderdrive(name);
	
		return "redirect:/showAllCarOrderdrives";
	}
}

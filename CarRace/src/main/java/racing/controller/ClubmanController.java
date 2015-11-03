package racing.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import racing.domain.Application;
import racing.domain.Clubman;
import racing.service.ClubmanService;


@Controller
public class ClubmanController {
	
	@Autowired
	private ClubmanService service;
	
	@RequestMapping(value = "/showAllClubmans")
	public String getAllClubmans(Model model){
		List<Clubman> clubmans = service.getAllClubmans();
		model.addAttribute("allClubmans", clubmans);
		return "clubman-all";
		
	}
	
	@RequestMapping(value = "/create/clubman")
	public String createClubmanPage(){
		return "clubman-new";
	}
	
	@RequestMapping(value = "/showAllClubmans", method = RequestMethod.POST)
	public String createClubman(@RequestParam(value = "name") String name,
			@RequestParam(value = "date_of_birdth") String dateofbirdth,
			@RequestParam(value = "nickname") String nickname) {
		
		service.insertClubman(name, dateofbirdth, nickname);
		
		return "redirect:/showAllClubmans";
	}
	
	
	///////////////////////
	
//	@RequestMapping(value = "/register")
//	private String showClubman(Model model) {
//		model.addAttribute("clubman", new Clubman());
//		model.addAttribute("clubmans", service.getAllClubmans());
//		return "register";
//	}
//	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	private String showAllClubman(@Valid Clubman clubman,
//			BindingResult bindingResult) {
//		if(bindingResult.hasErrors()) {
//			return "register";
//		} else {
//			service.insertCm(clubman);
//			return "redirect:/register.html";
//		}
//	}
//	
	///////////////////
	


}

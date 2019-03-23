package com.caner.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.caner.petclinic.service.PetclinicService;

@Controller
public class PetclinicController {
	
	@Autowired
	private PetclinicService petClinicService;	

	@RequestMapping("/hello")
	@ResponseBody
	public String sayhello() {
		return "Say Hello everybody";
	}
	@RequestMapping("/owners")
	public ModelAndView getOwners() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("owners", petClinicService.findOwners());
		mav.setViewName("owners");
		return mav;
	}
	

}

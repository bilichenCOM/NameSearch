package com.droptable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.droptable.service.AnulPlatnykPdvService;
import com.droptable.service.BankrutService;
import com.droptable.service.PlatnykPdvService;
import com.droptable.service.PodatkBorzhnykService;
import com.droptable.utils.CyrillicTextDecoder;

@Controller
public class NameSearchController {

	@Autowired
	private PlatnykPdvService platnykPdvService;

	@Autowired
	private PodatkBorzhnykService podatkBorzhnykService;

	@Autowired
	private AnulPlatnykPdvService anulPlatnykPdvService;

	@Autowired
	private BankrutService bankrutService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/search-name")
	public ModelAndView searchName(@RequestParam(name = "desirableName") String pibFromForm, ModelAndView mav) {
		String pib = CyrillicTextDecoder.getUtf8String(pibFromForm);
		mav.addObject("pib", pib);
		mav.addObject("platnikiPdv", platnykPdvService.getAllByPib(pib));
		mav.addObject("podatkBorzhniky", podatkBorzhnykService.getAllByPib(pib));
		mav.addObject("anulPlatnikiPdv", anulPlatnykPdvService.getAllByPib(pib));
		mav.addObject("bankruty", bankrutService.getAllByPib(pib));
		mav.setViewName("results");
		return mav;
	}
}
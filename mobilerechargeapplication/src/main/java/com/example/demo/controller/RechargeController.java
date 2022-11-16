package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repositories.OfferRepository;

@Controller
public class RechargeController {
	
	@Autowired
	OfferRepository oRepo;
	
	@RequestMapping("/")
	public String home() {
		
		return "information";
	}

	@GetMapping("showData")
	public String  showData(@RequestParam("operator") Integer oId) {
		
		System.out.println(oRepo.findByOperator(oId));
		return "";
	}
}
 
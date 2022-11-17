package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Bill;
import com.example.demo.model.Offers;
import com.example.demo.repositories.BillRepository;
import com.example.demo.repositories.OfferRepository;

@Controller
public class RechargeController {
	
	@Autowired
	OfferRepository oRepo;
	
	@Autowired
	BillRepository bRepo;
	
	@RequestMapping("/")
	public String home() {
		
		return "information";
	}

	@PostMapping("showData")
	public ModelAndView  showData(@RequestParam("operator") Integer oId,@RequestParam("phonenumber") Long pno) {
		
		ModelAndView mv = new ModelAndView("plandetails");
		mv.addObject("offerslist",oRepo.findByOperator(oId)); 
		mv.addObject("phonenumber",pno);
		return mv;
	}
	
	@PostMapping("saveplan")
	public ModelAndView  savePlan(@RequestParam("planId") Integer planId,@RequestParam("phonenumber") Long pno) {
		
		ModelAndView mv = new ModelAndView("rechargedetails");
		Offers obj = oRepo.findById(planId).orElse(new Offers());
		mv.addObject("myplan",obj);
		mv.addObject("phonenumber",pno);
		
		Bill bobj = new Bill();
		bobj.setMobileNumber(pno);
		bobj.setOfferId(planId);
		bRepo.save(bobj);
		mv.addObject("tid",bobj.gettId());
		
		return mv;
		
	}
}
 
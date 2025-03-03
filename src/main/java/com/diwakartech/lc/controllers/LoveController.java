	package com.diwakartech.lc.controllers;
	
	import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diwakartech.lc.DTO.LoveDTO;
	
	@Controller
	public class LoveController {
		
		@RequestMapping("/home")
		public String displayHome(@ModelAttribute("dtoobj") LoveDTO dto) {
		
			return "home";
		}
	    
		
		@RequestMapping("/result")
		public String displayResult(@Valid @ModelAttribute("dtoobj") LoveDTO dto,BindingResult result,HttpServletRequest httpServletRequest) {
			HttpSession session= httpServletRequest.getSession();
			session.setAttribute("userdto", dto);
			if(result.hasErrors()) {
				
				return "home";
			}
			return"result";
		} 
	}

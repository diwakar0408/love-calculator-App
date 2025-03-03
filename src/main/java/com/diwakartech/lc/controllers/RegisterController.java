package com.diwakartech.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diwakartech.lc.DTO.PhoneDTO;
import com.diwakartech.lc.DTO.RegisterDTO;
import com.diwakartech.lc.formatter.PhoneFormatter;

@Controller
public class RegisterController {
   
	@RequestMapping("/register")
	public String getRegister(@ModelAttribute("detailsdao") RegisterDTO dto) {
		PhoneDTO pDTO = new PhoneDTO();
		pDTO.setCountryCode("91");
		pDTO.setPhoneCode("9876543210");
		dto.setPdto(pDTO);
		dto.setLoveName("ram");
		return "register-home";
	}
	@RequestMapping("/reistersuccess")
	public String getRegisterSuccess(@Valid @ModelAttribute("detailsdao") RegisterDTO dto,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			List<ObjectError> result = bindingResult.getAllErrors();
			for(ObjectError e:result) {
				System.out.println(e);
			}
			return "register-home";
			
		}
		return "reister-success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
/*		NameEditor nameEditor=new NameEditor();
		binder.registerCustomEditor(String.class,"youName",nameEditor);*/
		//binder.setDisallowedFields("youName");
		binder.addCustomFormatter(new PhoneFormatter());
	}
}

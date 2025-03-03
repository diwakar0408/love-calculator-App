package com.diwakartech.lc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diwakartech.lc.DTO.EmailDTO;
import com.diwakartech.lc.DTO.LoveDTO;
import com.diwakartech.lc.services.EmailSenderImpl;

@Controller
public class EmailController {
	@Autowired
	EmailSenderImpl emailSenderImpl;
	
	@RequestMapping("/sendemail")
	public String getEmailer(Model model,HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		LoveDTO loveDTO = (LoveDTO) httpSession.getAttribute("userdto");
		model.addAttribute("userName","Mr."+loveDTO.getYouName());
		model.addAttribute("emaildto",new EmailDTO());
		return "email-send";
	}
	@RequestMapping("/processemail")
	public String getEmailerProcess(@ModelAttribute("emailDTO") EmailDTO emaildto,HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		LoveDTO loveDTO = (LoveDTO) httpSession.getAttribute("userdto");
		emailSenderImpl.sendEmail(loveDTO.getYouName(),"Lover",emaildto.getEmail());
		return "email-success";
	}

}

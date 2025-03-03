package com.diwakartech.lc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderImpl implements EmailSender {
	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String userName, String result, String userEmail) {
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setTo(userEmail);
		simpleMailMessage.setSubject("Love Calculator Result");
		simpleMailMessage.setText("Hi Mr."+userName+",\n The Result predicred by the Love Calucualtor\n"+result);
		javaMailSender.send(simpleMailMessage);

	}

}

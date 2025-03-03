package com.diwakartech.lc.config;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.diwakartech.lc.formatter.PhoneFormatter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.diwakartech.lc")
public class BeanConfiguration implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver in = new InternalResourceViewResolver();
		in.setPrefix("/WEB-INF/view/");
		in.setSuffix(".jsp");
		return in;

	}

	/*
	 * @Override public void addFormatters(FormatterRegistry registry) {
	 * registry.addFormatter(new PhoneFormatter());
	 * WebMvcConfigurer.super.addFormatters(registry); }
	 */
	@Bean(value = { "messageSource" })
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.addBasenames("message");
		return messageSource;
	}

	@Bean(value = { "validator" })
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		return localValidatorFactoryBean;

	}

	@Override
	public Validator getValidator() {
		return validator();
	}

	@Bean
	public JavaMailSender sendMailProcess() {
		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.gmail.com");
		javaMailSenderImpl.setPort(587);
		javaMailSenderImpl.setUsername("diwakarlovea@gmail.com");
		javaMailSenderImpl.setPassword("wogm bwju iefu znfp");

		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.auth", "true"); // Enable SMTP authentication
		mailProperties.put("mail.smtp.starttls.enable", "true"); // Enable STARTTLS
		mailProperties.put("mail.smtp.starttls.required", "true"); // Require STARTTLS
		mailProperties.put("mail.smtp.ssl.protocols", "TLSv1.2"); // Ensure TLS 1.2 is used
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com"); // Trust Gmail's SMTP

		javaMailSenderImpl.setJavaMailProperties(mailProperties);
		return javaMailSenderImpl;
	}
}

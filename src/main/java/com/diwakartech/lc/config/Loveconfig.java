package com.diwakartech.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Loveconfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class cl[] = { BeanConfiguration.class };
		return cl;
	}

	@Override
	protected String[] getServletMappings() {
		String url[] = { "/" };
		return url;
	}

}

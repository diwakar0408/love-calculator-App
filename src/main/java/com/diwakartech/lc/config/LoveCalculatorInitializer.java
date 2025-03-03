/*
 * package com.diwakartech.lc.config;
 * 
 * import javax.servlet.ServletContext; import javax.servlet.ServletException;
 * import javax.servlet.ServletRegistration;
 * 
 * import org.springframework.web.WebApplicationInitializer; import
 * org.springframework.web.context.support.
 * AnnotationConfigWebApplicationContext; import
 * org.springframework.web.servlet.DispatcherServlet;
 * 
 * public class LoveCalculatorInitializer implements WebApplicationInitializer {
 * 
 * @Override public void onStartup(ServletContext servletContext) throws
 * ServletException {
 * 
 * AnnotationConfigWebApplicationContext context=new
 * AnnotationConfigWebApplicationContext();
 * context.register(BeanConfiguration.class); DispatcherServlet dispatchservlet
 * = new DispatcherServlet(context); ServletRegistration.Dynamic
 * mycustomedispatcherservlet = servletContext.addServlet("DispatcherServlet",
 * dispatchservlet);
 * mycustomedispatcherservlet.addMapping("/love-calculator/love/*");
 * mycustomedispatcherservlet.setLoadOnStartup(1); }
 * 
 * }
 */
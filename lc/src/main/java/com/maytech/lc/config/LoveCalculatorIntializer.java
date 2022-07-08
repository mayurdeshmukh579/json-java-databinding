package com.maytech.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("classpath:application-config.xml");
		//create Dispatcher servlet object
		
		DispatcherServlet dispatcher = new DispatcherServlet(webApplicationContext); 
		
		//Register Dispatcher servlet to dispatcher context
		ServletRegistration.Dynamic myCustomDispatcherDynamic = servletContext.addServlet("myDispatcherServlet", dispatcher);
		
		myCustomDispatcherDynamic.setLoadOnStartup(1);
		myCustomDispatcherDynamic.addMapping("/myweb.com/*");
		
	}

}

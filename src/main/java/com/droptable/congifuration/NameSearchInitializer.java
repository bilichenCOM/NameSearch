package com.droptable.congifuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class NameSearchInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(NameSearchConfiguration.class);
		ContextLoaderListener webApplicationContextListener = new ContextLoaderListener(webApplicationContext);

		servletContext.addListener(webApplicationContextListener);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		dispatcher.addMapping("/resources");
	}
}
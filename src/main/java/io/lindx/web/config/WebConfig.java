package io.lindx.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
// public class WebConfig implements WebApplicationInitializer {

//     @Override
//     public void onStartup(ServletContext servletContext) throws ServletException {
        
//         AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
//         webAppContext.register(AppConfig.class);

//         DispatcherServlet dispatcherServlet = new DispatcherServlet(webAppContext);

//         ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", dispatcherServlet);

//         registration.setLoadOnStartup(1);

//         registration.addMapping("/app/*");
//     } 
// }

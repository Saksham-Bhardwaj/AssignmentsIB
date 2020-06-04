package com.saksham.aop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AopApplication.class, args);
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AopApplication.class,Business.class,AspectHelper.class);
		context.refresh();
		Business business = context.getBean(Business.class);
		business.businessLogic();
	}

}

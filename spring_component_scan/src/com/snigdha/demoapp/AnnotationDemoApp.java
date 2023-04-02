package com.snigdha.demoapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//get the config. file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach asgnCoach = context.getBean("mySpringApp",Coach.class);
		
		//call the methods on the bean

		System.out.println(asgnCoach.getDailyWorkout());
		
		System.out.println(asgnCoach.getDailyFortune());
		
		//close the context
		context.close();
		
		
		
		
	}

}

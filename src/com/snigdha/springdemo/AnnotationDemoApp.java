package com.snigdha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisdsCoach",Coach.class);
		
		//Activity -4
		//Coach theBadmintonCoach = context.getBean("badmintonCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//Activity -4
		//System.out.println(theBadmintonCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}

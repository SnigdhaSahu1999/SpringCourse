package com.snigdha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach theBadmintonCoach = context.getBean("badmintonCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Activity -4
		System.out.println(theBadmintonCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}

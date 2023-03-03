package com.snigdha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment5App {

	public static void main(String[] args) {
		
		//get the config. file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach asgnCoach = context.getBean("assignmentCoach",Coach.class);
		
		//call the methods on the bean

		System.out.println(asgnCoach.getDailyWorkout());
		
		System.out.println(asgnCoach.getDailyFortune());
		
		//close the context
		context.close();
		
		
		
		
	}

}

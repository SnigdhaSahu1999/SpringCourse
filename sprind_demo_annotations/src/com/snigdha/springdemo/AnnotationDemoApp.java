package com.snigdha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean(object)  from spring container
		//"tennisCoach" id is created automatically bcoz we are usimg @Component in TennisCoach class
		//Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//Activity -4
		Coach theBadmintonCoach = context.getBean("badmintonCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theBadmintonCoach.getDailyWorkout());
		
		System.out.println(theBadmintonCoach.getDailyFortune());
		
		//Activity -4
		//System.out.println(theBadmintonCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}

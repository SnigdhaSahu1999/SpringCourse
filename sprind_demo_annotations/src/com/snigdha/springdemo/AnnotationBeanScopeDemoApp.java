package com.snigdha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		
		/*Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they are the same
		boolean result = (tennisCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for tennisCoach: " + tennisCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");*/
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(tennisCoach.getDailyFortune());
		
		//close the context
		context.close();
		
		
	}

}

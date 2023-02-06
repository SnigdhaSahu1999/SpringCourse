package com.snigdha.springdemo;

public class BaseballCoach implements Coach {
	
	@Override 
	//@Override annotation is used to specify that we have overridden this method
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
		
	}
}

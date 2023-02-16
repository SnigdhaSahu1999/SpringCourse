package com.snigdha.springdemo;

import org.springframework.stereotype.Component;

//Activity -4
@Component
public class BadmintonCoach implements Coach {
	
	public BadmintonCoach() {
		System.out.println("Inside default constructor of BadmintonCoach");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice striking a shuttlecock";
	}
	

}

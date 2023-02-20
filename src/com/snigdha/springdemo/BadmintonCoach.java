package com.snigdha.springdemo;

import org.springframework.stereotype.Component;

//Activity -4
@Component
public class BadmintonCoach implements Coach {
	

	@Override
	public String getDailyWorkout() {
		
		return "Practice striking a shuttlecock";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

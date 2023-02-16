package com.snigdha.springdemo;

import org.springframework.stereotype.Component;

/*giving bean id in the annotation
@Component("thatSillyCoach")*/

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

}

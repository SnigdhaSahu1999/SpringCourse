package com.snigdha.springdemo;


public class SwimCoach implements Coach {
	
	private FortuneService fortuneService; 
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swin 1000 metres as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

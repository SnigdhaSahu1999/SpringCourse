package com.snigdha.demoapp;

import org.springframework.stereotype.Component;

@Component("happyFortune")
public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day champ!";
	}

}

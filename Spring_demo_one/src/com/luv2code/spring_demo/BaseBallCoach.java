package com.luv2code.spring_demo;

public class BaseBallCoach implements Coach {
	private FortuneService thefortune;
	
	public BaseBallCoach(FortuneService thefortuneService) {
		thefortune=thefortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "spending 30 minute in the batting practice";
	}

	@Override
	public String getDailyFortne() {
		// TODO Auto-generated method stub
		return thefortune.getfortune();
	}

}

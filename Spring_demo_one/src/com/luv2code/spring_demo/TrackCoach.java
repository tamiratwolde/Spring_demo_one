package com.luv2code.spring_demo;

public class TrackCoach implements Coach {
	private FortuneService myfortune;
	
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		
		return "trach coach class";
	}

	public TrackCoach(FortuneService thefortune) {
		super();
		this.myfortune = thefortune;
	}

	@Override
	public String getDailyFortne() {
		// TODO Auto-generated method stub
		return "Just Do it"+myfortune.getfortune();
	}
   //add Init methode 
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach Insiade : Domystartupstuff methode");
	}
	
	//add destroye methode
	
	public void doMyCleanUpStuffYoYo() {
		System.out.println("TrackCoach Insiade : DomystartupstuffYoYo methode");
	}
}







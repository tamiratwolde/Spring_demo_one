package com.luv2code.spring_demo;

public class CricketCoach implements Coach {
	private FortuneService thefortune;
	
	//creat private field 
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach, Insiade the Setter method, EmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("Cricket Coach, Insiade the Setter method, team");
		
		this.team = team;
	}



	public FortuneService getThefortune() {
		return thefortune;
	}



	public CricketCoach() {
		System.out.println("Cricket Coach, Insiade no argument constractor");
	}
	
	

	public void setThefortune(FortuneService thefortuneService) {
		
		System.out.println("Cricket Coach, Insiade the setter Methode");
		this.thefortune = thefortuneService;
	}



	@Override
	public String getDailyWorkout() {
	
		return "Practice fast bowling in 15 Mniute";
	}

	@Override
	public String getDailyFortne() {
	
		return thefortune.getfortune();
	}

}

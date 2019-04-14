package com.luv2code.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SeterDemoApp {

	public static void main(String[] args) {
		//load the spring configeration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrive beans from the spring conteaner
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the beans 
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortne());
		
		//call the new method to get the literal value 
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();

	}

}

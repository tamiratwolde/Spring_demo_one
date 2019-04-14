package com.luv2code.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configeration file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    //ritrive  the bean from Spring container.
		
	Coach thecoach= context.getBean("myCoach",Coach.class);
	
	System.out.println(thecoach.getDailyWorkout());
	
	System.out.println(thecoach.getDailyFortne());
	context.close();
		
	}

}







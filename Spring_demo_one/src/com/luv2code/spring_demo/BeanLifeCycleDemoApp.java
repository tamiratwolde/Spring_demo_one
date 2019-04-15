package com.luv2code.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");

		
		//retirive the bean object
     Coach thecoach =context.getBean("myCoach",Coach.class);
     System.out.println(thecoach.getDailyWorkout());
     System.out.println(thecoach.getDailyFortne());

		//close the context
		context.close();
		
	}

}

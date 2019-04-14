package com.luv2code.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");

		
		//retirive the bean object
		Coach thecoach =context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach =context.getBean("myCoach",Coach.class);
		
		boolean result =(thecoach==alphaCoach);
		
		System.out.println("\nPrinting to the same Object" +result);
		System.out.println("\nMemory Location for the  Coach" +thecoach);
		System.out.println("\nMemory location for thealphacoach"+alphaCoach);
		//close the context
		context.close();
		
	}

}

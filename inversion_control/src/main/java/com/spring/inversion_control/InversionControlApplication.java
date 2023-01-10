package com.spring.inversion_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionControlApplication {

	public static void main(String[] args) {
		
		//General process of calling methods in main class.
		/*Mobiles obj = new OnePlus();
		obj.getModelAndColor();
		
		Mobiles obj1 = new IPhone();
		obj1.getModelAndColor();*/
		//=================================================
		
		//to get all beans which we created in configuration class, we have to create spring bean container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobileConfg.class);
		
		Mobiles obj = context.getBean("getOnePlusObj",Mobiles.class);
		obj.getModelAndColor();
		
		Mobiles obj1 = context.getBean("getIPhoneObj", Mobiles.class);
		obj1.getModelAndColor();
		
	}
	
	

}

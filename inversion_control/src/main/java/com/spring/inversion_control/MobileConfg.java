package com.spring.inversion_control;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//to know that this class belongs to configuration, we have to give annotation.
@Configuration
public class MobileConfg {
	
	//the bean annotation will declare this method as bean method
	@Bean
	public Color getColor() {
		return new Color();
	}
	@Bean
	public Mobiles getOnePlusObj(Color getColor) {  //here we can use interface or class name
		//above we are injecting dependencies(color getColor).
		return new OnePlus(getColor);
	}
	
	@Bean
	public Mobiles getIPhoneObj(Color getColor) {  
		return new IPhone(getColor);
	}

}

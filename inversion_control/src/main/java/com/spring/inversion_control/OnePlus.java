package com.spring.inversion_control;

public class OnePlus implements Mobiles {
	
	Color color; //creating color dependency object
	
	OnePlus(Color colorObj){  //this is constructor dependency as we are using constructor.
		this.color = colorObj;
	}

	@Override  //auto generated override method 
	public void getModelAndColor() { 
		
		System.out.println("Model: 9 pro");
		color.getOnePlusColor();
	}

}

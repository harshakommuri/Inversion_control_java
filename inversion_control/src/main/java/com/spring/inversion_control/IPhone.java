package com.spring.inversion_control;

public class IPhone implements Mobiles {
	
	Color color; //dependency object
	
	IPhone(Color colorObj){
		this.color = colorObj;
	}

	@Override  //auto generated override method 
	public void getModelAndColor() {
		// TODO Auto-generated method stub
		System.out.println("Model: Iphone12");
		color.getIPhoneColor();
		

	}

}

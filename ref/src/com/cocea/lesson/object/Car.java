package com.cocea.lesson.object;

class Vehicle {
	//vehicle attribute => protected
	protected String brand = "bmw";
	//vehicle method
	public void bureng() {
		System.out.println("�θ� �θ�");
	}
}


public class Car extends Vehicle{
	
	private String modelName = "840i";

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.bureng();
		
		System.out.println(myCar.brand +  " " + myCar.modelName);

	}

}
package com.devmanual;

 class Car {
	  static String brand;
	  long price;
	  String color;
	  String Model;
 }
 

	  class TestCar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car C1 = new Car();
		C1.brand = "Mercedes";
		C1.price = 2500000;
		C1.color = "BLACK";
		C1.Model  = "Q3";
		System.out.print(C1.brand + " ");
		System.out.print(C1.price + " ");
		System.out.print(C1.color + " ");
		System.out.println(C1.Model + " ");
		
		C1.price = 3000000;
		C1.Model  = "Q4";	
		System.out.println("*******************************************************");
		System.out.print(C1.brand + " ");
		System.out.print(C1.price + " ");
		System.out.print(C1.color + " ");
		System.out.println(C1.Model + " ");
	
	}

}

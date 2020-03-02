package com.devmanual;


class Student5 {
	  String name = "KAJOL";
	  static String city = "New Delhi";
	  Student5()
	  {
		  System.out.println("Inside class STUDENT constructor");
}
}
 class Child extends Student5 {
}

public class TestChild {
	public static void main(String[] args) {
		Child TC = new Child();
		System.out.println(Student5.city);
		System.out.println( TC.name);
		Student5.city = "MUMBAI";
		TC.name = "NEHA";
		System.out.println(Student5.city);
		System.out.println( TC.name);
		
		// TODO Auto-generated method stub

	}
}




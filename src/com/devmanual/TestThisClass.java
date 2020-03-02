package com.devmanual;

 class ThisClass {
	
	String name;
	
	void display( String name) {
		this.name = name;
		System.out .println( "Hi! My name is  = " +this.name);
	}
 }
	class TestThisClass {
		  public static void main(String[] args)
		  {
			   ThisClass TC = new ThisClass();
			   TC.display("Puneet");
			   System.out.println(TC.name);
			   
		  }
	}
	
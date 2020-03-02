package com.devmanual;

class ParameterizedMethods {
	     
	      void addno( int a, int b)
	      {
	    	    int c=a+b;
	    	    System.out.println("addition = " +c);
	   /*   void print(String s){
	    	    System.out.println("The string is= " +s);
	    	    System.out.println("Inside print"); */
	      }

	public static void main(String[] args) {
		ParameterizedMethods PM=new ParameterizedMethods();
	//	String m="Hello World";
		//PM.print(m);
		PM.addno(6,7);
		System.out.print("Inside main");
		
	}

}

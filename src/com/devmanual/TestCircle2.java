package com.devmanual;

class Circle2
{
	 double r=2.5;
	 final double pi = 3.14159;
	 
	 
	 void area(double p)
	 {
		// double p = perimeter();
		 double  a = (p*p)/(4*pi);
		 System.out.println("Area is = "+ a);
		 add(a,p);
		// return p+a;
		// return a;
	 }
	 
	 void perimeter() 
	 {
		
		double p = 2*pi*r;
		System.out.println("perimeter = "+p);
		area(p);         // Navigation inside methods , directly from one method to another
		//return p;	
}
	
	 
	
	   void add(double areacircle, double pericircle)
	   {
	   	double c = areacircle+pericircle;
		   System.out.println("Added value = " +c);
	//	return c;
		
	   }  
}

public class TestCircle2 {

	public static void main(String[] args) {
		Circle2 C1 = new Circle2();
		C1.perimeter();
    //    C1.add();
	//	System.out.println("Perimeter is = "+ p);
	  //  double a =	C1.area(p);
	  //  System.out.println("Area is = "+ a);
	/* 	double added_value = C1.add();
		System.out.println("Added value  is = " +added_value);  */
		  
	}
	
}



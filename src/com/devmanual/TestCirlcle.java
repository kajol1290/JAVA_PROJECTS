package com.devmanual;
class Circle {
	  
    double radius;
    
    double area(double r)
    {  
    	 double a= 3.14*r*r;
         return a;
    	  
    }
    
}

class TestCirlcle {

	public static void main(String[] args) {
		Circle C1=new Circle();
		double p = C1.area(4.3);
		System.out.println("Area of first Circle  = " +p);
		double q = C1.area(5.0);
		System.out.println("Area of Second circle = " +q);
		double r = C1.area(12.45);	
		System.out.println("Area of Third circle  = " +r);
		
	
		
	}

}

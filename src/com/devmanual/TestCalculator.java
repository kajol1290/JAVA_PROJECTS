package com.devmanual;


class Calculator
{

     
	String brand;
      int price;
	  int a,b;
	  int c;
	  int add()
	  {
		    c=a+b;
	      //System.out.println("Addition of two numbers a + b = c"  +c);
	       return c;
	  }
	int sub()
	  {
		    c=b-a;
		//  System.out.println("subraction = " +c);
		    return c;
		    
	  }
	  int mul(){
		   c=a*b;
		 //System.out.println("product = "+c);
		   return c;
	  }
    int area()
     {
    	   c=a*a;
    	 //System.out.println("Area = " +c);
    	   return c;
     }
}
class TestCalculator {
	
	public static void main(String[] args) {
	   Calculator C1=new Calculator();
	   C1.price=800;
	   C1.brand="CASIO";
	   System.out.println("Brand = " +C1.brand);
	   System.out.println("Price = "+C1.price);
	  C1.a=5;
	  C1.b=10;
	int add_1=C1.add();
	System.out.println("Addition = " +add_1);
	int sub_1=C1.sub();    
	// add_1=C1.sub();
	// System.out.println("Subraction = " +add_1);
	System.out.println("Subraction = " +sub_1);
	int mul_1=C1.mul();
	System.out.println("multiply = "+mul_1);
	int area_1=C1.area();
	System.out.println("Area = "+area_1);
	
	}

}

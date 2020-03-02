package com.devmanual;
class Calc{
	   int a=10;
	   int b=5;
	   void display(){
		   System.out.println("First value = " +a);
		   System.out.println("Second value = " +b);
	   }
	   int add(){
		  int c=a+b;
		  return c;
		  
	   }
	   int sub(){
		   int c=a-b;
		   return c;
	   }
	 
}
 
public class TestCalc {
	public static void main(String [] args){
		Calc c1=new Calc();
		float m=c1.add();
		float n=c1.sub();
		float add_1=m+n;
		float sub_1=m-n;
		float mult_1=m*n;
		float areaofsum=add_1*add_1;
		c1.display();
		System.out.println("Addition = " +add_1);
		System.out.println("subraction = " +sub_1);
		System.out.println("Multiply = "  +mult_1);
		System.out.println("Area of the sum = " +areaofsum);
		
		
		
	}
	
	

}

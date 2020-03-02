package com.devmanual;

class Calculator2{
	  int a,b;
	  
	 int add2(int a, int b) {
		   int c = a+b;
		   System.out.println("Addition = " +c);
		   return c;
	 }
	  int sub2( int a, int b){
		    int c = a-b;
		    
		    return c;
	  }
	  int prod2( int a, int b){
		    int d = a*b;
		    
		    return d;
	  }
	  int area2 ( int a, int b){
		  int d = a*a;
		  int q = d-b;
		  System.out.println("Value q = " +q);
		  return d;
	  }
}
 class TestCalc2 {

	public static void main(String[] args) {
          Calculator2 C2=new Calculator2();
          int a = C2.add2(3,5);
          System.out.println("Addition = " +a);
         int b = C2.sub2(8,5);
         System.out.println("Subraction = " +b);
        int c =   C2.prod2(3,5);
        System.out.println("Product = " +c);
           //C2.area2(6,3);
          
          int total = a+b; 
          int m = C2.area2(5,total);
          System.out.println("Area is = " +m);
         // area2(5,total);
         
	}
}

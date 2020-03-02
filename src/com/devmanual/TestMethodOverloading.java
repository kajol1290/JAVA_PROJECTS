package com.devmanual;

 class MethodOverloading {
	      int a;
	      String b;
	      
	      void fun(int a)
	      {
	    	    System.out.println("I am in first fun()");
	      }
	      void fun(String b)
	      {
	    	  System.out.println("I am in second fun()");
	    	  
	      }
	      void fun (char c)
	      {
	    	  System.out.println("I am in  third fun()");
	      }
}
class TestMethodOverloading
{
	    		  
	      public static void main(String[] args) {
	    	  MethodOverloading MO = new MethodOverloading();
	    	  MO.fun("ABCD");
	    	  MO.fun(10);
	    	  MO.fun('c');
	    	  


	}

}

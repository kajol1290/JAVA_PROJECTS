package STATIC;

public class StaticVar {
	
	static int a = m1();  //1
	
	 static  //3
	 {
		  System.out.println("Inside STATIC BLOCK !!!!!");
	 }
   static int m1() //2
   {
	    System.out.println("Inside function m1()"); 
	    a = 20;
	    return a;
   }
	public static void main(String[] args) {
		
		StaticVar sv = new StaticVar();
		System.out.println("Inside Main!!!!!"); //4
		System.out.println("Value of a = " +a);  //5
		
		// TODO Auto-generated method stub

	}

}

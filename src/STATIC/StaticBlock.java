package STATIC;


class StaticBlock {
	   
	static int a = 10;
	 static int b;


 static {
	    System.out.println("Static Block Entered!!!!");
	     b = a*4; 
 }

	public static void main(String[] args) {
		System.out.println("Inside Main.....");
		System.out.println("a = " +a);
		System.out.println("b  = " +b);
		
	}
		// TODO Auto-generated method stub

	}



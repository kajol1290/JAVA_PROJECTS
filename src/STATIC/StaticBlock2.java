package STATIC;

public class StaticBlock2 {
	
	     static {
	    	   System.out.println("Inside STATIC BLOCK!!!!!");
	     }

	      StaticBlock2()
	      {
	    	    System.out.println("Inside Constructor");
	      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StaticBlock2 sb = new StaticBlock2();
		  StaticBlock2 sb2 = new StaticBlock2();
		 

	}

}

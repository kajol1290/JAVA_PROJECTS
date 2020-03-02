package com.devmanual;

class StaticLearn {

	    static String batchcode;
	      String name;
	      int ino;
	      boolean is_clear;
	      static String subject;
	      
	      void display()
	      {
	    	  System.out.println("Batchcode = " +batchcode+ "Name = " +name + "Subjectb = " +subject );
	      }
}
	      class TestStaticLearn {
	public static void main(String[] args) {
		
		StaticLearn SL = new StaticLearn();
		SL.batchcode = "NSCM3";
		SL.name = "KAJOL";
		SL.ino = 5;
		SL.is_clear = true;
		SL.subject = "CORE JAVA";
		System.out.print(SL.batchcode + " ");
		System.out.print(SL.name + " ");
		System.out.print(SL.ino + " ");
		System.out.print(SL.is_clear + " ");
		System.out.println(SL.subject + " ");
		
		
	    StaticLearn SL2 = new StaticLearn();
	    SL.name = "CHETNA";
		SL.ino = 10;
		SL.is_clear = false;
		System.out.print(SL2.batchcode + " ");
		System.out.print(SL2.name + " ");
		System.out.print(SL2.ino + " ");
		System.out.print(SL2.is_clear + " ");
		System.out.print(SL2.subject + " ");
		
		
	}
	    	  
		// TODO Auto-generated method stub

	}



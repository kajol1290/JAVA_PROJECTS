package com.devmanual;

 class VisitingCard{

  // final String coname="TCS";
	 String coname;
   String ename;
   long  contact;
   String emailid;
   String designation;
   
   VisitingCard( String m , String e, long c, String em, String d)
   {
	   System.out.println("Visiting Card Details : Employee name = " +e+ ", Contact = "+c + ", Email id = "+em +
			   ", Designation = " +d);
			         
   }
}

class TestVisitingCard{
   
   static public void main(String [] args)
   {
	   System.out.println("Please create one card");
	   VisitingCard VC2 = new VisitingCard("Synopsys", "KAJOL", 9910652563l,"singhkajol013@gmail.com", "QA");
	   VisitingCard VC3 = new VisitingCard("Cadence", "SHREYA", 9910645563l,"shreya045@gmail.com", "Test Lead");
	   /*VisitingCard VC1=new VisitingCard();   // to store object, data type is class of that objects
	   System.out.println("The name of emp is= " +VC1.ename);
	   System.out.println("\n");
	   VC1.ename="Kajol";
	   VC1.contact=9910652563l;
	   VC1.emailid="singhkajol013@gmail.com";
	   VC1.designation="QA"
	   System.out.println("the name of employee is = " +VC1.ename);
	   System.out.println("the contact number of emp is ="+VC1.contact);
	   System.out.println("the designation of employee is =" +VC1.designation);*/ 
	}
}

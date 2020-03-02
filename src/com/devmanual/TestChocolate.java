package com.devmanual;

class Chocolate{
	  String type;
	  
	  String name;
}
  class Trainer2{
	  String name;
	  String subject;

Chocolate clearsDoubt() 
{
	 System.out.println("Ye hai class");
	 System.out.println("I hope it is clear");
	 Chocolate c=new Chocolate();
	 c.type="dark Chocolate";
	 c.name = "Cadbury";
	 return c;
}
}

 class StudentClass{
	
	String name;
	boolean is_doubt;
	Chocolate askDoubt()
	{
		System.out.println("I got a doubt");
		Trainer2 t=new Trainer2(); 
		t.name="Azam";
		t.subject="JAVA";
		System.out.println("Sir! Doubt");
		System.out.println("What class?");
		Chocolate rc=t.clearsDoubt();  // rc is identifier of chocolate
		System.out.println("I got a choolate"  +rc.name);
		return rc;
		
	}
}

class TestChocolate {

	public static void main(String [] args) {
		 StudentClass s=new StudentClass();
		 s.name="Rathore";
		 s.is_doubt=true;
		Chocolate rc =  s.askDoubt();
		System.out.println("Chocolate is " +rc.name);

	}

}

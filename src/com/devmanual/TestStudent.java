package com.devmanual;

class Trainer {
	String name;
	  void display()
	  {
		  System.out.println("------------Inside Trainer Class-----------");
		  System.out.println("Student approached trainer.");
		 // System.out.println("\n");
	  }
}

class Student_1{
	String name;
	void display()
	{
		  System.out.println("-------------Inside Student Class----------");
		  System.out.println("Student has doubt. ");
		 // System.out.println("\n");
	}
		
}

  class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student_1 S1=new Student_1();
    S1.name="Kajol";
    System.out.println("------------------Inside main------------");
    System.out.println("The student name is = " +S1.name);
    S1.display();
    Trainer T1=new Trainer();
    T1.name="Azam";
    T1.display();
    System.out.println("----------------------Back to Main, class -> TestStudent---------------");
    System.out.println("The trainer name is = " +T1.name);
    System.out.println("Doubt of Student = " +S1.name +  " is solved. 	");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    
    Student_1 S2=new Student_1();
    S2.name="Chetna";
    System.out.println("Inside main");
    System.out.println("The student name is = " +S2.name);
    S1.display();
    Trainer T2=new Trainer();
    T2.display();
    
    System.out.println("------------------Back to Main, class -> TestStudent----------------------");
    T2.name="Rahul";
    System.out.println("The trainer name is = " +T2.name);
    
    System.out.println("Doubt of Student = " +S2.name +  " is solved. ");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}

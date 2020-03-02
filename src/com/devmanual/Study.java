package com.devmanual;
class Qspiders{
	String addr;   //string to store alphanumeric values
	int floors;
	
}

class Student{
	String name;
	String addr;
	
}
class Trainers{
	String name;
	String subject;
	long contact;

}
class Study {

	public static void main(String[] args) {
		
		Qspiders Q1=new Qspiders();
		Q1.addr="A-29, Sector-3 , Noida";
		Q1.floors=3;
		
		Student S1=new Student();
		S1.name="Kajol";
		S1.addr="C4, Janakpuri";
		
		Trainers T1=new Trainers();
		T1.name="Azam";
		T1.subject="JAVA";
		T1.contact=991064565l;
				
		
		System.out.println("Qspiders address= " +Q1.addr);
		System.out.println("Qspiders floors = " +Q1.floors);
		System.out.println("Student Name    = " +S1.name);
		System.out.println("Student addr    = " +S1.addr);
		System.out.println("Trainer name    = " +T1.name);
		System.out.println("Trainer name    = " +T1.subject);
		System.out.println("Trainer contact = " +T1.contact);
		
		
		
		// TODO Auto-generated method stub

	}

}

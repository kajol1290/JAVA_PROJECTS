package com.devmanual;

public class Junk {
	String name;
	int age;
	
	String display()
	{
		System.out.println("Inside Display");
		 String lastname = "Singh";
	 //   String finame = "Singh"; // local members "lastname" local to method display()
	    System.out.println("lastname = " +lastname);
	    return lastname;
	  //  System.out.println("name = " +name);               // this will print global name = Kajol
    //	return name;
	}
	
    void show(String m)
    {
	    System.out.println("Inside Show");
	    System.out.println("lastname = " +m);           //lastname is local to the method display()
    }
    
public static void main(String[] args) 
    {
	Junk j = new Junk();
	j.name="Kajol";
	j.age=26;
	System.out.println("Inside main");
	System.out.println("Name = " +j.name);
	System.out.println("Age = " + j.age);
    String m = j.display();
	j.show(m);
	}
}

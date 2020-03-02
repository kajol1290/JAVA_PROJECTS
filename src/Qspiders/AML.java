package Qspiders;

public class AML {
protected String name;
public int age;
public boolean is_clear;
public char gender; // by default the access modifier of every member is package, to make them accessible 
             // visible inside class of different package that has inherited this class(AML) we need to make them public
          // or protected.

public void display()

{
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(is_clear);
	  System.out.println(gender);
}
}
/* public static void main(String [] args){
	AML a = new AML();
	a.name = "KAJOL";
	a.age=25;
	a.is_clear=true;
	a.gender='F';
	a.display();
}
}
*/

	
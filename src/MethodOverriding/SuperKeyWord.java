package MethodOverriding;


class A {
	   String name;
	   int id;
	   
	   A(String n, int i)
	   {
		   this.name=n;
		   this.id=i;
		   System.out.println("Inside A Parent class constructor");
	   }
}
class B extends A {
	int age;
	
	B(String name, int id, int age)
	{
		super(name,id);
		this.age=age;
		  System.out.println("Inside B Child class constructor");
	}
	
	void display()
	{
		System.out.println("name : " +name+ ", id : "+id+ ", age : "+age);
	}
	
}
public class SuperKeyWord {

	public static void main(String[] args) {
		
		B b = new B("KAJOL", 001,27);
		b.display();
		

		
	}

}

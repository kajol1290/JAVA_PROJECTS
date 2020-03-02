package Abstract;

abstract class Parent {
	   String name = "Bella";
	  abstract void display();
}

abstract class Child1 extends Parent {
	   String name = "James";
	   abstract void display();
}

abstract class Child2 extends Child1 {
	String name = "Allen";
	 abstract void display();
}

class Child3 extends Child2 { // Concrete class
	   String name = "Alice";
	   void display(){
		   System.out.println("Name = "+name);
	   }
}
public class TestParent {

	public static void main(String[] args) {
		Child2 c2 = new Child3();
		c2.display();
		System.out.println(c2.name); 
		c2.display();
		
		
		// TODO Auto-generated method stub

	}

}

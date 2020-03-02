package Demo;


import Qspiders.AML;
public class Dummy2 {

	public static void main(String[] args) {
		
		AML a = new AML();
	//	a.name = "KAJOL"; //  name member of class AML of package Qspiders is protected and hence cannot be accessed
		                   // to access the protected member "name" of class Qspiders we need to make Dummy2 to inherit the 
		                    // class AML.
		a.age = 20;   // Accessible as these members are public
		a.gender = 'F';
		a.is_clear=false;
		a.display();
		
		
		// TODO Auto-generated method stub

	}

}

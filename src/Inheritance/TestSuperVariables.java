package Inheritance;

class SuperVariables {
	
	 int number = 120;
}

class C extends SuperVariables {
	 int number = 100;
	 void display()
	 {
		 System.out.println(number);
		 System.out.println(super.number);
	 }
}

class TestSuperVariables {


	public static void main(String[] args) {
		C C1  = new C();
		C1.display();
		// TODO Auto-generated method stub

	}

}

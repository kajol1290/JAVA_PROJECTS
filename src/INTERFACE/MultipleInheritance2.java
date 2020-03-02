package INTERFACE;

interface Food {
	  void print();
	 
}

interface Fruit {
	 void print();
}

class Aa implements Food,Fruit {
	
	public void print()
	{
		 System.out.println("I like Apples!!");
	}
	 
}
public class MultipleInheritance2 {

	public static void main(String[] args) {
		Aa a = new Aa();
		a.print();
		// TODO Auto-generated method stub

	}

}

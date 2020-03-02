package INTERFACE;


interface Continent {
	void print();
}

interface Country extends Continent {
	
	void show();
}
 class State implements Country {
	
	public void print()
	{
		System.out.println("Continent");
	}
	public void show()
	{
		System.out.println("Country");
	}
}

class InterfaceInheritance {

	public static void main(String[] args) {
		State s = new State();
		s.print();
		s.show();
		// TODO Auto-generated method stub

	}

}

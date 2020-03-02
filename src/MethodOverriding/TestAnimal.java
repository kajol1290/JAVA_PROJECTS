package MethodOverriding;

class Animal {
	   void eat()
	   {
		    System.out.println("EATING");
	   }
}
class Dog extends Animal {
	  void eat()
	  {
		  System.out.println("Eating Fruits......");
	  }
}
class BabyDog extends Dog {
	   void eat ()
	   {
		   System.out.println("Eating Vegetables....");
	   }
}

class TestAnimal {
	  public static void main( String [] args)
	  {
		  Animal a1 = new Animal();
		  a1.eat();
		  Animal a2 = new Dog();
		  a2.eat();               // Although the upcasted reference will access superclass method however,
		                          //Due to inheritance , the implementation will come from child class overridden method.
		  Animal a3 = new BabyDog();
		  a3.eat();
			
	  }
}
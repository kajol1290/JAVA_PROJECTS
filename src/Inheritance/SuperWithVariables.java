package Inheritance;
class ParentClass
{
	  int i;
}
class BaseClass extends ParentClass {
	  int i;
	  BaseClass( int x, int y )
	  {
		  super.i=x;
		  i=y;
	  }
	  void display()
	  {
		  System.out.println(" i in Parent Class = " +super.i);
		  System.out.println(" i in Base Class = " +i);
	  }
}
public class SuperWithVariables {

	public static void main(String[] args) {
		BaseClass B = new BaseClass(2,4);
		B.display();
		// TODO Auto-generated method stub

	}

}

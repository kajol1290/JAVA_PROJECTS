package Inheritance;

class X1
{
    public X1(int i)
    {
        System.out.println(1);
    }
}
 
class Y1 extends X1
{
    public Y1()
    {  
    	super(10);       // Write Explicit calling statement to Super class "X1" constructor in Sub class "Y1 constructor
        System.out.println(2);
    }
}

class Ques10
{
	 public static void main (String [] args) {
		   Y1 y = new Y1();
	 }
}
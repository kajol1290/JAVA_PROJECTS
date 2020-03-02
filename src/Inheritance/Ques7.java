package Inheritance;

class A4
{
    public A4()
    {
        System.out.println("Class A Constructor");
    }
}
 
class B4 extends A4
{
    public B4()
    {
        System.out.println("Class B Constructor");
    }
}
 
class C4 extends B4
{
    public C4()
    {
        System.out.println("Class C Constructor");
    }
}
 
public class Ques7
{
    public static void main(String[] args)
    {
        C4 c = new C4();        // Constructors are executed in the order of derivation i.e from superclass to subclass.
    }
}


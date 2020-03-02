package Inheritance;

class A3
{
    static
    {
        System.out.println("THIRD");
    }
}
 
class B3 extends A3
{
    static
    {
        System.out.println("SECOND");
    }
}
 
class C3 extends B3
{
    static
    {
        System.out.println("FIRST");
    }
}
 
public class Ques6
{
    public static void main(String[] args)
    {
        C3 c = new C3();
    }
}

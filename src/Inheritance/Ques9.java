package Inheritance;

class X
{
    static void staticMethod()
    {
        System.out.println("Class X");
    }
}
 
class Y extends X
{
    static void staticMethod()
    {
        System.out.println("Class Y");
        //super.staticMethod(); // Not Allowed as we cannot use SUPER in STATIC context.
        // X.staticMethod();  // to call staticMethod() of Base class X.
    }
}
 
public class Ques9
{
    public static void main(String[] args)
    {
        Y.staticMethod();
    }
} 


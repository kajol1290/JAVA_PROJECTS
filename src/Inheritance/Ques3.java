package Inheritance;
class Aa
{
    {
        System.out.println(1);
    }
}
 
class Bb extends Aa
{
    {
        System.out.println(2);
    }
}
 
class Cc extends Bb
{
    {
        System.out.println(3);
    }
}
 
public class Ques3
{
    public static void main(String[] args)
    {
        Cc c = new Cc();              // Constructors are execuuted in the order of the derivation i.e from
                                      // from superclass to subclass.
                                      // Because a superclass has no knowledge of any sublass, any initialization it
                                     // needs to perform is separate from sub class and possibly prerequisite to any 
                                      // initialization performed by the subclass.
    }
}
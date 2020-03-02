package Inheritance;
class A5
{
    int i = 10;
}
 
class B5 extends A5
{   
	int i =20;
       
    
}
 
class Ques2
{
    public static void main(String[] args)
    {
        A5 a = new A5();
 
        System.out.println(a.i);
    }
}
package MethodOverriding;

  class A12 {
	
	public static void a()
	{
		System.out.println("Superclass - a()");
	}
	
}
  class B12 extends A12{
	
	public static void a()
	{
		System.out.println("Subclass - b()");
	}
  }
  class Test12{
	  
	public static void main(String[] args) 
	{
         B12 d = new B12();
         d.a();
         A12 a = new A12();
         a.a();
         A12 a1 = new B12();
         a1.a();
              		 
	}

}

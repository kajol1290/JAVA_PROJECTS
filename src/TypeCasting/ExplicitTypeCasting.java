package TypeCasting;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
		    double d = 280.04;
		    int i =(int) d; // Fractional part lost
		    long l = (long)d; // Fractional part lost
		    System.out.println("NARROWING OR EXPLICIT TYPE CASTING");
		    System.out.println("Double Value = " +d);
		    System.out.println("Double to Integer Value = " +i);
		    System.out.println("Double to Long Value = " +l);
		    System.out.println("*****************************************************");
		 //   byte b = 257; // b=d%256
		    byte q = (byte)d;
		    byte m = (byte)i; // m=i%256
		    byte n = (byte)l;   // n=l%256
		    System.out.println("Byte Value = " +q);
		    System.out.println("Integer to Byte Value = " +m);
		    System.out.println("Long to Byte Value = " +n);
		    
		// TODO Auto-generated method stub

	}

}

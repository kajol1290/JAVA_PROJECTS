package String;

public class StringComparison {

	public static void main(String[] args) {

		      String s1 = "SACHIN";
		      String s2 = "TENDULKAR";
		      // String comparison by equals() method.
		       boolean s3 = s2.equals(s1);
		        boolean s4 = s1.equalsIgnoreCase("Sachin");
		        System.out.println(s3);
		        System.out.println(s4);
		        
		     // Comparison by "==" operator.
		      
		        System.out.println(s1==s2);

               // String comparison by compareTo() method.
		        
		       int s5 = s2.compareTo(s1);
		       String s6 = "tendulkar";
		       int s7 = s6.compareTo(s2);
		       System.out.println(s7);
		       int s8 = s1.compareTo("SACHIN");
		       int s9 = s2.compareToIgnoreCase(s6);
		       int s10 = s1.compareTo(s2);
		       System.out.println(s8);
		       System.out.println(s9);
		       System.out.println(s10);
		       
		       
		       
              
	}

}

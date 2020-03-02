package PracticePrograms;

public class ReverseStringRecursive {
	
	public static String reverseString(String str)
	{
		if((str==null) || (str.length()<=1))
				{
			return str;
				}
		else
		{
			
	         return reverseString(str.substring(1)) + str.charAt(0);

		}
				
	}

	public static void main(String[] args) {
		String s="MYJAVA";
		String str = reverseString(s);
		System.out.println("Reversed string is :" +str);
		
		
		

	}

}

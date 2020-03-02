package String;

public class UpperCase {

	 static void display()
	 {
		 String s = "Kajol";
		 char [] arr = s.toCharArray();
		 for(int i = 0;i<arr.length;i++)
		 {
			  int j = arr[i];
			  j = j-32;
			  arr[j]=(char)j;
		 }
		 for(char c : arr)
		 {
		 System.out.println(c);
		 }
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		display();
		// TODO Auto-generated method stub

	}

}

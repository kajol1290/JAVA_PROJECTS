package INTERFACE;


 interface A{
	void a();
}
 
 interface B{
	 void a();
 }
 
 class Text implements A,B{
	 
	 public void a()
	 {
		 System.out.println("Inside class.....");
	 }
	 }
public class MultipleInheritance3 {

	public static void main(String[] args) {
		
		Text t = new Text();
		t.a();
				

	}

}

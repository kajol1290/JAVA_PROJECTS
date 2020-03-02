package com.devmanual;

class Toy2 {
	    
	  void kidCries()
	  {
		  String kid_message = "Bhainnn!!";
		  System.out.println("Kid Cries = " +kid_message);
		  momWakesAndPurchase(kid_message);
		 // String m = momGivesToy();
		  
	  }
	  
	  void momWakesAndPurchase(String km)
	  {
		   
		  System.out.println("Mom Received kids message as = " +km);
		  System.out.println("Mom Says - " + "Aleeeeee, Wait!!");
		 String m = sellstoy();
		 System.out.println("Mom Purchased the toy = " +m);
		 momGivesToy(m);
		  
	  }
	  String sellstoy()
	  {  
		  String toy ="SPIDERMAN";
		  int price = 100;
		  return toy;
		   
	  }
	  void momGivesToy( String m)
	  {
		  System.out.println("Mom gives the toy = " +m);
	  }
}
public class TestToy2 {

	public static void main(String[] args) {
		Toy2 t2 =new Toy2();
		t2.kidCries();
		// TODO Auto-generated method stub
		

	}

}

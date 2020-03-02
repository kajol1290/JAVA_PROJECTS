package MethodOverriding;


class Bank {
	
	   int get_rate_of_interest()
	   {  
		     return 0;
	   }
}
class SBI extends Bank {
	   
	   int get_rate_of_interest() 
	   {
		     return 6;
	   }
	   
}
class ICICI extends Bank {
	   int get_rate_of_interest()
	   {
		   return 10;
	   }
}
class PNB extends Bank {
	   int get_rate_of_interest()
	   {
		     return 7;
	   }
	   
}
 class TestBank {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SBI s = new SBI();
         ICICI i = new ICICI();
         PNB p = new PNB();
         System.out.println("Rate of Interest of SBI Bank = " +s.get_rate_of_interest());
         System.out.println("Rate of Interest of ICICI Bank = " +i.get_rate_of_interest());
         System.out.println("Rate of Interest of PNB Bank = " +p.get_rate_of_interest());
         
	}

}

package Encapsulation;


class Account {
	
	    String name;
	  private   int passwd;
	   private  int bal;
	    long accno;
	 
	 Account(String name, int passwd, int bal, long accno)
	 {
		   this.name = name;
		   this.passwd = passwd;
		   this.bal = bal;
		   this.accno =  accno;
	 }
	void setBalance(long accno, int passwd, int money)
	{
		if(this.passwd == passwd)
		{
			 this.bal = this.bal + money;
		}
		else 
		{
			System.out.println("Invalid Password!!!!!");
		}
	}
	int getBalance(long accno,int passwd)
	{
		if( this.passwd == passwd)
		{
			this.bal = this.bal;
			return bal;
		}
		else {
			System.out.println("Invalid Password!!!!!!");
			return 0;
		}
	}
}


class TestAccount {

	public static void main(String[] args) {
		
		Account a = new Account("Salman", 3466,2000, 9835858854839l);
		System.out.println("Account holder nae = "+a.name);
	//	System.out.println(a.passwd);  //field Account.passwd is private and hence not visible.
	//	System.out.println(a.bal);  // private
		System.out.println("Account Number = "+a.accno);
		a.setBalance(9835858854839l,3466 , 1000);
		int b = a.getBalance(9835858854839l,3466);
		System.out.println("Balance is = " +b);
		// TODO Auto-generated method stub

	}

}

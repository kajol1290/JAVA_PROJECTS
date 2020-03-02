package Programming;

class HCF_LCM {

	  static void calculate(int x, int y)
	  {
		  
		    int a = x; //10
		    int b = y; // 20
		    
		    int t;
		   while ( b!= 0)
		   {
			   t=b; // 20 // 10
			   b=a%b;// 10%20 = 10 // 20%10 = 0
			   a=t; // // 20 // 10
			    
		   }
		   int hcf = a; //5 // 10
		   int lcm = (x*y)/hcf; //10 // 20
	  
	 
	 System.out.println("HCF is : " +hcf);
	 System.out.println("LCM is :  " +lcm);
		  
		  
	  }

	public static void main(String[] args) {
		
		// HCF_LCM hl = new HCF_LCM();
		 calculate(10,20);
		// TODO Auto-generated method stub

	}
	}


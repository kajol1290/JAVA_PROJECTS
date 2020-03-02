package Inheritance;


class Version1 {
	     long number;
	     
	     Version1 ( long n)
	     {
	    	 number = n;
	    	 System.out.println("**************************************************************");
	    	 System.out.println("Inside Super class - VERSION 1.0 of WHATSAPP Aplication");
	    	 System.out.println("Whatapp Number is = " +number);
	     }
	     void send_message()
	     {
	    	 System.out.println(" Sending Message");
}
	     void receive_message()
	     {
	    	 System.out.println("Receiving Message");
	     }
}

class Version2 extends Version1
{
	  boolean is_grp_name;
	  boolean is_No_of_grpMembers;
	  Version2(boolean gn, boolean gm, long n)
	  {
		  super(n);
		  is_grp_name = gn;
		  is_No_of_grpMembers = gm;
		 // System.out.println("**************************************************************");
		  System.out.println("New Whatsapp Version available - VERSION 2.0");
		  System.out.println("Below are the features added : ");
		  System.out.println("Added Group Name feature  = "+is_grp_name);
		  System.out.println("Added No of Group Members feature = " +is_No_of_grpMembers);
	  }
	  
	  void create_group()
	  {
		  System.out.println("##########Inside VERSION 2.0 Class###########");
		   System.out.println("New Whatsapp group created");
		   
	  }
	  void delete_grp()
	  {
		   System.out.println("Whatsapp group Deleted");
	  }
}
class Version3 extends Version2 {
	   boolean is_voiceCall;
	   boolean is_videoCall;
	   Version3(boolean gn, boolean gm, long n, boolean voice, boolean video)
	   {
		   super(gn,gm,n);
		   is_voiceCall = voice;
		   is_videoCall = video;
		  // System.out.println("**************************************************************");
		   System.out.println("New whatsapp Version Available !!! - VERSION 3.0");
		   System.out.println("Below are the features : ");
		   System.out.println("Added Voice call feature = " +is_voiceCall);
		   System.out.println("Added Video Call feature = " +is_videoCall);
		  // System.out.println("Whatsapp Updated - VERSION 3.0");
	   }
	   void make_voiceCall(){
		     System.out.println("~~~~~~~~~~Inside VERSION 3.0 Class~~~~~~~~~~");
		     System.out.println("MAKE Voice Call");
		     
	   }
	    void make_videoCall()
	    {
	    	 System.out.println("Make Video Call");
	    }
}
 class TestVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Version2 v2 = new Version2(true, true ,9810567234l);
		  Version3 v3 = new Version3(true, true, 9910123456l, true, true );
		  Version1 v1_1 = new Version2(true, true ,9810567234l);  // UPCASTING
		  v1_1.send_message();
		  v1_1.receive_message();
		  Version2 v2_1 = (Version2)v1_1;   // DOWNCASTING
		  v2_1.create_group();
		  v2_1.delete_grp();
		  
		  Version2 v2_2 = new Version3(true, true, 9910123456l, true, true);   // UPCASTING
		  v2_2.create_group();
		  v2_2.delete_grp();
		  
		  Version3 v3_1 = (Version3) v2_2;  // DOWNCASTING
		  v3_1.make_voiceCall();
		  v3_1.make_videoCall();
		  
		  
		  
		  

	}

}

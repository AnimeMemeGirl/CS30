package Account;

public class BusinessAcct extends Account
{

	   public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip)
	    {
	        super(bal, fName, lName, str, city, st, zip);
	    }
	    
	    public void withdrawal(double amt)
	    {
	    	
			if(amt <= super.getBalance() - 10)
			{
				super.withdrawal(amt);
				
				if(super.getBalance() < 500)
				{
					super.withdrawal(10);
					
					System.out.println("Because of a low balance, 10 dollars has been charged to your account.");
				}
			}
			else
			{
				System.out.println("Insufficient amount for withdrawal.");
			}
	    	
	    }
	
}

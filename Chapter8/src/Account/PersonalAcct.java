package Account;

public class PersonalAcct extends Account
{
    public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip)
    {
        super(bal, fName, lName, str, city, st, zip);
    }
    
    public void withdrawal(double amt)
    {
    	
		if(amt <= super.getBalance() - 2)
		{
			super.withdrawal(amt);
			
			if(super.getBalance() < 100)
			{
				super.withdrawal(2);
				
				System.out.println("Because of a low balance, 2 dollars has been charged to your account.");
			}
		}
		else
		{
			System.out.println("Insufficient amount for withdrawal.");
		}
    	
    }
}

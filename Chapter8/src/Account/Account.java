package Account;

/*

Program: Account.java          

Purpose:

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/


import java.text.NumberFormat;

public class Account 
{

    private double balance;
    private Customer cust;
    
    public Account(double bal, String fName, String lName, String str, String city, String st, String zip)
    {

        balance = bal;
		cust = new Customer(fName, lName, str, city, st, zip);
        
    }

    public double getBalance()      
    {
        
        return(balance);// send balance to a calling statement
        
    }
    
    public void deposit(double amt)    
        {
	 	balance += amt;// balance is equal or greater to the amount
	}
    
    public void withdrawal(double amt)    
        {
	 	if (amt <= balance) // if balance is greater or equal to balance
                    {
	 		balance -= amt;// if balance is is less than or equal to amount
	 	    } 
                else 
                    {
	 		System.out.println("Not enough money in account.");
	 	    }
	}
    
    
    public void changeAddress(String str, String city, String st, String zip)
    {
        
        cust.changeStreet(str);
        cust.changeCity(city);
        cust.changeState(st);
        cust.changeZip(zip);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    public String toString() 
        {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);// send account string to calling statement
	}
	
}

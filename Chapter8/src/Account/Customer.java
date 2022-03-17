package Account;

public class Customer 
{
    private String firstName, lastName, street, city, state, zip;
    
    public Customer(String fName, String lName, String str, String c, String s, String z) 
    {

        firstName = fName;
		lastName = lName;// lastName  equals last name
		street = str;//streat equals str
		city = c;// city equals c
		state = s;//state equals s
		zip = z;//zip equals z
        
    }
    
    public void changeStreet(String str)
    {
        street = str;//streat equals str
    }
    
    public void changeCity(String c)
    {
        city = c;// city equals c
    }
    
    public void changeState(String s)
    {
        state = s;//state equals 
    }
    
    public void changeZip(String z)
    {
        zip = z;//zip equals z
    }
    
    
    
    

    public String toString()
    {
        
        String custString ="";
	
		
		
		custString += firstName + " " + lastName + " " +street + ", " + city + ", " + state + "  " + zip + "\n";
	 	return(custString);//send custString to a calling statement
        
    }
    
}

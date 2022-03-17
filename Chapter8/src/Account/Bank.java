package Account;

import java.text.NumberFormat;
import java.util.Scanner;

public class Bank 
{

    public static void main(String[] args) 
        {
		Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
                String street;
                String city;
                String state;
                String zip;
                
		NumberFormat money = NumberFormat.getCurrencyInstance();

		System.out.println(munozAccount);

		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
                
                System.out.print("Enter the new street: ");
                street = input.next();
                
                input.next();
                System.out.print("Enter the new city: ");
                city = input.next();
                
                System.out.print("Enter the new state: ");
                state = input.next();
                
                System.out.print("Enter the new zip code: ");
                zip = input.next();
                
                munozAccount.changeAddress(street, city, state, zip);
                System.out.println(munozAccount);
                
                
                
                
                
	}

}

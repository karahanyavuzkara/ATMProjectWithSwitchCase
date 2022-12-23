package patika;
import java.util.Scanner;
public class ATMProject {

	public static void main(String[]args) {
		String userName, password ;
		Scanner input = new Scanner(System.in);
		int right = 3 ;
		int balance = 1500;
		int withdrawMoney, depositMoney;
		while ( right > 0) {
			System.out.print("Username : ");
			userName = input.nextLine();
			System.out.print("Password : ");
			password = input.nextLine();
		
		if (userName.equals("karahan") && password.equals("sapanca")) {
			System.out.print("You have loginned successfully.");
			System.out.println("Welcome to the menu.");
			System.out.println("1 - To withdraw money\n" + 
					  "2 - Deposit money\n" + 
					  "3 - Check your Balance\n"+ 
					  "4 - Exit. "
					);
			  
			}
			
			else {
				right--;
				System.out.print("Username or password is wrong. Try again. ");
		        System.out.println(" Remaining rights : " +right);
		 
		        if ( right == 0 ) {
		        	System.out.print("Your account has been blocked.");;
		        	
		        }
		}
		 System.out.print("Enter your selection as 1-2-3-4 : ");
		  int selection = input.nextInt(); 
		
		  switch (selection) {
		
		  case 1 : //withdraw
			System.out.print("How much money do you want to withdraw : ");
			withdrawMoney = input.nextInt();
			System.out.print("Your balance is " + (balance - withdrawMoney)  + " now ");
		
		case 2 : //deposit 
			System.out.println("How much money do you want to depost : ");
			depositMoney = input.nextInt();
			System.out.print("Your balance is " + (balance + depositMoney)  + " now ");
			
		
		case 3 : //balance
			System.out.println("Your balance is " + balance );
			
		case 4 : 
			System.out.println("");
			
		
			
		
	}
		}
	}
}

import java.util.Locale;
import java.util.Scanner;
import entities.Account;
public class Construtores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  account holder: ");
		String holder = sc.nextLine();
		System.out.println("Enter your account number: ");
		int number = sc.nextInt();
		System.out.println("Is there an inital deposit?");
		char initialDeposit = sc.next().charAt(0);
		if(initialDeposit == 'y') { 
			System.out.println("How much would you want to deposit?");
			double amount = sc.nextDouble();
			Account account = new Account(number,holder);
			account.deposit(amount);
			System.out.println( account);
			
		}
			
			
		}
		sc.close();
	}
}

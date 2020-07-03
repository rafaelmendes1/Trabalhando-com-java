package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyBank;

public class ProgramBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyBank cb;
		double valuemon = 0;
		
		System.out.print("Enter account number: ");
		int acnum = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char res = sc.next().charAt(0);
		
		if (res == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			cb = new CurrencyBank(acnum, name, initialDeposit);
			cb.deposit(valuemon);
		} else {
			cb = new CurrencyBank(acnum, name);
		}
		
		sc.nextLine();
		System.out.printf("Account Data: %n%s", cb);
		
		System.out.print("Enter a deposit value: ");
		valuemon = sc.nextDouble();
		cb.deposit(valuemon);
		System.out.printf("Update account data: %n%s", cb);
		
		System.out.print("Enter a widthdraw value: ");
		valuemon = sc.nextDouble();
		cb.widrw(valuemon);
		System.out.printf("Update account data: %n%s", cb);
		
		sc.close();
	}

}

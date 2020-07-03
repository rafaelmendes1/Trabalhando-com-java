package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountTryCatch;
import exceptions.DomainException;

public class ProgAccountTry {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		AccountTryCatch account = new AccountTryCatch(holder, number, balance, withdrawLimit);
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.println("New balance: " + String.format("%.2f", account.getBalance() ));
		
		} catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}

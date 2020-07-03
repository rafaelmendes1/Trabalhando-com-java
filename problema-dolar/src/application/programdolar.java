package application;

import java.util.Locale;
import java.util.Scanner;

public class programdolar {
	public static final double IOR = 1.06;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? ");
		double dolarprice = sc.nextDouble();
		
		System.out.print("How many dollars will be boght? ");
		double quantity = sc.nextDouble();
		
		double exchange = CurrencyConverter(dolarprice, quantity);
		
		System.out.println("Amount to be paid in reais = " + exchange);
		
		sc.close();
		
	}
	public static double CurrencyConverter(double dolarprice, double quantity) {
		return (dolarprice * quantity)/IOR;
	}

}

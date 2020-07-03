package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.PersonC;
import entities.PersonL;

public class PersonTax {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double anIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double deHealth = sc.nextDouble();
				list.add(new PersonC(name, anIncome, deHealth));
			} else {
				System.out.print("Number of Employees: ");
				int emp = sc.nextInt();
				list.add(new PersonL(name, anIncome, emp));
			}

		}
		
	
		Double sum = 0.0;
		for (Person tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getAnIncome());
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.print("TOTAL TAXES: " + sum);
		
		sc.close();
	}

}

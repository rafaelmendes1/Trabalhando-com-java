package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Funcionario(id, name, salary));
			
			
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int searc = sc.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId() == searc).findFirst().orElse(null);
		if(func != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			func.increaseSalary(percentage);
		}else {
			System.out.println("Id not exists");
		}
			
		System.out.println("List of employees:");
		for(Funcionario obj : list) {
			System.out.println(obj);
		}
			
		sc.close();
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}

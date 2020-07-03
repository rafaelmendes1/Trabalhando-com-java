package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class ProgramPensio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		Pensionato[] vect = new Pensionato[rooms];
		for (int i=0; i<rooms; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			vect[i] = new Pensionato(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		for(int x = 0; x < vect.length; x++) {
			
			System.out.println(vect[x]);
		}
		
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Medianotas;

public class Programnotas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Medianotas mdn = new Medianotas();
		
		System.out.print("Nome: ");
		mdn.name = sc.nextLine();
		System.out.print("Notas A:");
		mdn.a = sc.nextDouble();
		System.out.print("Notas B:");
		mdn.b = sc.nextDouble();
		System.out.print("Notas C:");
		mdn.c = sc.nextDouble();
		sc.close();
		System.out.println(mdn);
	}

}

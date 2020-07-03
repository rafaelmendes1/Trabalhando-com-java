package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite o valor de a, b, c triangle X: ");
		x.a = sc.nextInt();
		x.b = sc.nextInt();
		x.c = sc.nextInt();
		System.out.println("Digite o valor de d, e, f triangle Y:");
		y.a = sc.nextInt();
		y.b = sc.nextInt();
		y.c = sc.nextInt();
		
		
		double ar1 = x.area();
		double ar2 = y.area();
		
		System.out.printf("triangle X area: %.2f %n", ar1);
		System.out.printf("triangle y area: %.2f %n", ar2);
		
		if(ar1 > ar2) {
			System.out.println("triangle X is larger");
		}else {
			System.out.println("triangule Y is larger");
		}
		
		sc.close();
	}

}

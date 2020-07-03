package applications;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int G = 0;
		int A = 0;
		int D = 0;
		
		System.out.println("Digite 1 para Álcool");
		System.out.println("Digite 2 para Gasolina");
		System.out.println("Digite 3 para Diesel");
		System.out.println("Digite 4 para sair");
		
		int x = sc.nextInt();
		
		do { 	
			switch (x) {
			
			case 1:
				A++;
				break;
			case 2:
				G++;
				break;
			case 3:
				D++;
				break;
			}
			System.out.println("Digite 1 para Gasolina: ");
			System.out.println("Digite 2 para Álcool: ");
			System.out.println("Digite 3 para Diesel: ");
			System.out.println("Digite 4 para sair: ");
			 x = sc.nextInt();
		} while(x != 4);
		
		sc.close();
		System.out.println("Muito Obrigado!");
		System.out.println("Álcool: " + A);
		System.out.println("Gasolina: " + G);
		System.out.println("Diesel: " + D);
		
	}

}

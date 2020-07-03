package applications;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i=0; i<x; i++) {
			int z = sc.nextInt();
			if(z>=10 && z<=20) {
				a++;
			}else {
				b = b + 1;
			}
		}
		sc.close();
		System.out.println("in " + a);
		System.out.println("out " + b);
	}

}

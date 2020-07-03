package applications;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int r = 1;
		for(int i=1; i<=x ;i++) {
			r =  r * i;
			System.out.println(r);
		}
		System.out.println(r);
		sc.close();
	}

}

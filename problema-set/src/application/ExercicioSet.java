package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int courseA = sc.nextInt();
		for(int i = 0; i< courseA; i++) {
			int a = sc.nextInt();
			set.add(a);
		}
		
		System.out.print("How many students for course B? ");
		int courseB = sc.nextInt();
		for(int i = 0; i< courseB; i++) {
			int a = sc.nextInt();
			set.add(a);
		}
		
		System.out.print("How many students for course C? ");
		int courseC = sc.nextInt();
		for(int i = 0; i< courseC; i++) {
			int a = sc.nextInt();
			set.add(a);
		}
		
		System.out.print("Total students: " + set.size());
		sc.close();
	}

}

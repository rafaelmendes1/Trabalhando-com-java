package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class exercicioFile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] lines = new String[] {"TV LED, 1290.99, 1",
				"Video Game Chair, 350.50, 3","Iphone X, 900.00, 2"
				,"Samsung Galaxy 9, 850.00, 2"};
		
		String path = "/home/rafael/Documents/in.csv";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}	
		} catch (IOException e){
			e.printStackTrace();
		}
		sc.close();
	}

}

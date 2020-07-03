package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductsFiles;

public class ProgramProductsFile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ProductsFiles> list = new ArrayList<>()
;		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new ProductsFiles(fields[0], Double.parseDouble(fields[1])));
				br.readLine();
			}
			
			list.forEach(System.out::println);
			
		}catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}

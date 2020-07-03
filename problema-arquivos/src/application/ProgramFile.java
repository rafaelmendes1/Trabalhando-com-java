package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductsFiles;

public class ProgramFile {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "/home/rafael/Documents/in.csv";
		String pathout = "/home/rafael/Documents/in/out.csv";
		
		List<ProductsFiles> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				String[] products = line.split(", ");
				String name = products[0];
				double price = Double.parseDouble(products[1]);
				int quantity = Integer.parseInt(products[2]);
				line = br.readLine();
				list.add(new ProductsFiles(name, price, quantity));
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathout))){
				for (ProductsFiles p : list) {
					bw.write(p.getName() + ", " + p.total());
					bw.newLine();
				}	
			} catch (IOException e){
				e.printStackTrace();
			}	
			
		} catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
		
	}

}

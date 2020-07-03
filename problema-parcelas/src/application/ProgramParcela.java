package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContractParcel;
import entities.Installment;
import services.PayTaxService;
import services.RentalParcela;

public class ProgramParcela {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		
		ContractParcel con = new ContractParcel(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		Integer n = sc.nextInt();
		
		RentalParcela renserv = new RentalParcela(new PayTaxService());
		
		renserv.processContract(con, n);
		
		System.out.println("Installments:");
		for (Installment x : con.getInstallments()) {
			System.out.println(x);
		}
		
		
		sc.close();
	}

}

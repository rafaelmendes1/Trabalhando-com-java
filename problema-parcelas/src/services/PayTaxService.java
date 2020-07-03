package services;

public class PayTaxService implements TaxParcel{

	public double paymentFee(double amount) {
		return amount * 2/100;
	}
	
	public double mostSimp(double amount, Integer mouth) {
		return amount * mouth * 1/100 ;
	}

}

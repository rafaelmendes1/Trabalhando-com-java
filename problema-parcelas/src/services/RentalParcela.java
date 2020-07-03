package services;

import java.util.Calendar;
import java.util.Date;

import entities.ContractParcel;
import entities.Installment;

public class RentalParcela {

	private TaxParcel taxParcel;
	
	public RentalParcela(TaxParcel taxParcel) {
		this.taxParcel = taxParcel;
	}
	
	public void processContract(ContractParcel contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updatedQuota = basicQuota + taxParcel.mostSimp(basicQuota, i);
            double fullQuota =  updatedQuota + taxParcel.paymentFee(updatedQuota);
            contract.addInstallment(new Installment(date, fullQuota));
        }
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
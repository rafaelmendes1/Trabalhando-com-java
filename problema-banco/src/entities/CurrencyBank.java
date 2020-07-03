package entities;

public class CurrencyBank {
	private int acnum;
	private String name;
	private double valuemon;
	
	public CurrencyBank(int acnum, String name) {
		this.acnum = acnum;
		this.name = name;
	}
	public CurrencyBank(int acnum, String name, double initalDeposit) {
		this.acnum = acnum;
		this.name = name;
		deposit(initalDeposit);
	}
	
	public int getAcnum() {
		return acnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValuemon() {
		return valuemon;
	}

	
	public double deposit(double valuemon) {
		return this.valuemon += valuemon;
	}
	
	public double widrw(double valuemon) {
		return this.valuemon -= valuemon + 5 ;
	}
	
	public String toString() {
		return "Account "
				+ acnum
				+ ", Holder: " 
				+ name
				+ String.format(", Balance: $ %.2f%n", valuemon);
	}
	
	
	
	
	
}

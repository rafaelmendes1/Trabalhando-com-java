package entities;

public class ImportedProduct extends ProductTg{
	
	Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice(double customsFee) {
		return this.customsFee + price;
	}
	
	@Override
	public String priceTag() {
		return name
				+ " $ "
				+ totalPrice(customsFee)
				+ " (Customs fee: $ "
				+ customsFee
				+")";
	}
}

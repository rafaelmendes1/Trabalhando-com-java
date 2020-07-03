package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends ProductTg {
	Date manufactureDate;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	} 
	
	public String priceTag() {
		return name
				+ " (used) $ "
				+ price
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate)
				+")";
	}
}
	


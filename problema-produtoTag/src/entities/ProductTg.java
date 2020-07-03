package entities;

public class ProductTg {
	String name;
	Double price;
	
	public ProductTg(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name
				+ " $ "
				+ price;
	}
	
}

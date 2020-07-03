package entities;

public class OrderItem {
	Integer quantity;	
	Double price;
	
	private ProductOrder product;
	
	
	
	public OrderItem(Integer quantity, Double price, ProductOrder product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductOrder getProduct() {
		return product;
	}

	public void setProduct(ProductOrder product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}

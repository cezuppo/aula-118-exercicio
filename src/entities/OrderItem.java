package entities;

import entities.Product;

public class OrderItem {

	private Integer quantity;
	private Product product;
	private Double price;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getProduct() {
		price = product.getPrice();
		return price;
	}

	public double subTotal() {
		return quantity * price;
	}
	
	
	
	
}

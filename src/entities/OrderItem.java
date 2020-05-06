package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
		
	List<Product> products = new ArrayList<>();
	
	public OrderItem(){
		}

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
			}

	public static void add(OrderItem item) {
				
	}
	public Double Subtotal() {
		return price * quantity;
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

	public List<Product> getProduct() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}

}

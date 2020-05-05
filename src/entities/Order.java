package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;
import entities.OrderItem;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private Double total;
	
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Double total) {
		super();
		this.moment = moment;
		this.status = status;
		this.total = total;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<OrderItem> getOrderItem() {
		return items;
	}

	public void addOrderItem(OrderItem item) {
		items.add(item);
	}

}
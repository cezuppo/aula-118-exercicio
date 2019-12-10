package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	public Order() {
	}

	public Order(OrderStatus status) {
		this.status = status;
		this.moment = new Date();
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
}

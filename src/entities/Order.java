package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private String status;
	
	public Order() {
	}

	public Order(String status) {
		this.status = status;
		this.moment = new Date();
	}

	public Date getMoment() {
		return moment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = OrderStatus.valueOf(status);
	}
	
}

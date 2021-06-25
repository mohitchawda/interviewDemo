package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {

	@Id
	private int id;
	private String orderTotal;
	private String purchasedAt;
	private Date orderCreateDate;
	
	@OneToMany(mappedBy="orders" ,fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private List<OrderLines> orderLines;

	public Orders() {
		super();
	}

	public Orders(int id, String orderTotal, String purchasedAt, Date orderCreateDate, List<OrderLines> orderLines) {
		super();
		this.id = id;
		this.orderTotal = orderTotal;
		this.purchasedAt = purchasedAt;
		this.orderCreateDate = orderCreateDate;
		this.orderLines = orderLines;
	}

	public Orders(int id, String orderTotal, String purchasedAt, Date orderCreateDate) {
		super();
		this.id = id;
		this.orderTotal = orderTotal;
		this.purchasedAt = purchasedAt;
		this.orderCreateDate = orderCreateDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(String orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getPurchasedAt() {
		return purchasedAt;
	}

	public void setPurchasedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}

	public Date getOrderCreateDate() {
		return orderCreateDate;
	}

	public void setOrderCreateDate(Date orderCreateDate) {
		this.orderCreateDate = orderCreateDate;
	}

	public List<OrderLines> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLines> orderLines) {
		this.orderLines = orderLines;
	}

	
	
}

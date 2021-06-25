package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="order_lines")
public class OrderLines {

	@Id
	private String itemId;
	private String itemDescription;
	private int itemQty;
	private double itemPrice;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id")
	@JsonIgnore
    private Orders orders;
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	@Override
	public String toString() {
		return "OrderLines [itemId=" + itemId + ", itemDescription=" + itemDescription + ", itemQty=" + itemQty
				+ ", itemPrice=" + itemPrice + "]";
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}

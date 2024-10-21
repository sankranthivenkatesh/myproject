package com.venkatesh.order;

import com.venkatesh.item.Item;

public class Order {
	private int orderid;
	private Item[] item;
	private  double finalprice;
	public Order() {
		
	}
	public Order(int orderid, Item[] item, double finalprice) {
		super();
		this.orderid = orderid;
		this.item = item;
		this.finalprice = finalprice;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item[] item) {
		this.item = item;
	}
	public double getFinalprice() {
		return finalprice;
	}
	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}
	

}

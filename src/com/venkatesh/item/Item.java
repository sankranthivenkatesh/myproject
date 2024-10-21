package com.venkatesh.item;

public class Item {
	private int itemid;
	private String itemname;
	private double itemprice;
	private int numberofunits;
	private String category;
	public Item() {
		
	}
	public Item(int itemid, String itemname, double itemprice, int numberofunits, String category) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.numberofunits = numberofunits;
		this.category = category;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getItemprice() {
		return itemprice;
	}
	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}
	public int getNumberofunits() {
		return numberofunits;
	}
	public void setNumberofunits(int numberofunits) {
		this.numberofunits = numberofunits;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}

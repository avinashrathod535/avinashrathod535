package com.pathlock.sboot.Model;

public class Item {

	int itemid;
	float itemPrice;
	String itemName;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemid, float itemPrice, String itemName) {
		super();
		this.itemid = itemid;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemPrice=" + itemPrice + ", itemName=" + itemName + "]";
	}

}

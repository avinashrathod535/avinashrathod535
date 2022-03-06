package com.think.Iteam;

public class Iteam {
	
	private int iteamid;
	private String brand;
	private String storage;
	private String ram;
	private int price;   
	private String colour;
	private String display;	
	private int qty;

	
	public Iteam() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Iteam(int iteamid, String brand, int price, int qty) {
		super();
		this.iteamid = iteamid;
		this.brand = brand;
		this.price = price;
		this.qty = qty;
	}


	public int getIteamid() {
		return iteamid;
	}


	public void setIteamid(int iteamid) {
		this.iteamid = iteamid;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getStorage() {
		return storage;
	}


	public void setStorage(String storage) {
		this.storage = storage;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getDisplay() {
		return display;
	}


	public void setDisplay(String display) {
		this.display = display;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	@Override
	public String toString() {
		return "Iteam [iteamid=" + iteamid + ", brand=" + brand + ", storage=" + storage + ", ram=" + ram + ", price="
				+ price + ", colour=" + colour + ", display=" + display + ", qty=" + qty + "]";
	}

}

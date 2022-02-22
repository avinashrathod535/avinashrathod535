package com.think.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	@GeneratedValue
	private int mobileid;
	private String brand;
	private String storage;
	private String ram;
	private int price;
	private String colour;
	private String display;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mobileid, String brand, String storage, String ram, int price, String colour, String display) {
		super();
		this.mobileid = mobileid;
		this.brand = brand;
		this.storage = storage;
		this.ram = ram;
		this.price = price;
		this.colour = colour;
		this.display = display;
	}

	public int getMobileid() {
		return mobileid;
	}

	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
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

	@Override
	public String toString() {
		return "Mobile [mobileid=" + mobileid + ", brand=" + brand + ", storage=" + storage + ", ram=" + ram
				+ ", price=" + price + ", colour=" + colour + ", display=" + display + "]";
	}

}

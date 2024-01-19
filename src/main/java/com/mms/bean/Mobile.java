package com.mms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tbl_mobiledet")
public class Mobile {
	@Id
	@Column(name = "mob_id")
	private int id;
	@Column(name = "mob_brandname")
	private String brand;
	@Column(name = "mob_modelname")
	private String model;
	@Column(name = "mob_price")
	private int price;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String brand, String model, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}

}

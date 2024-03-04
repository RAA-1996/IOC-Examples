/**
 * @author: 	Richard Altamore
 * @date: 		Feb 2, 2024
 * @project:	AnnotationIOC
 * @file:		Product.java
 */
package com.cogent.AnnotationIOC;

import org.springframework.beans.factory.annotation.Autowired;

//import com.cogent.ClassBassedIOC.Laptop2;

public class Product {
	
	private String name;
	private Brand brand;

	//HOMEWORK--------------------------------------------------------------------
	private int id;
	private float price;
	private String[] rams;
	//private Laptop2 laptop;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String[] getRams() {
		return rams;
	}
	public void setRams(String[] rams) {
		this.rams = rams;
	}
	
	//----------------------------------------------------------------------------
	
	
	
	public Product() {
		System.out.println("Product Constructor here!");
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	public Brand getBrand() {
		return brand;
	}
	@Autowired
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	
	
}

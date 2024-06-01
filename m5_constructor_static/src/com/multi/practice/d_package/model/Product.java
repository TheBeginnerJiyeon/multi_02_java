package com.multi.practice.d_package.model;

public class Product {
	
	
	private int id;
	private String name;
	private double price;
	private int myCount=0;
	public static int count = 0;
	
	public Product() {
		
		count++;
	}
	
	public Product(int id, String name, double price) {
		
		count++;
		this.myCount = count;
		this.id = id;
		this.name = name;
		this.price = price;
		
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product{" +
				"순번=" + myCount +
				", id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}

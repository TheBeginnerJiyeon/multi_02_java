package com.multi.homework;

import javax.swing.*;

public class Jajangmyeon extends Food {
	private String field = "짜장면";
	private int price = 5000;
	private static int count = 0;
	private static int total = 0;
	
	
	public Jajangmyeon() {
		Food f1 = new Food();
		
		count++;
		total += price;
		
		int sum1 = f1.getTotal_price();
		int count1 = f1.getTotal_count();
		f1.setTotal_price(sum1 + price);
		f1.setTotal_count(count1 + 1);
		
		
	}
	
	@Override
	public void happy() {
		super.happy();
		System.out.println("짜장면을 먹으면 행복합니다.");
	}
	
	@Override
	public void button_click(Food j, String now, JTextField t1, JTextField t2, JLabel l2) {
		System.out.println("짜장면 1개 추가");
		super.button_click(j, now, t1, t2, l2);
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "짜장면{" +
				"field 1='" + super.getField() +
				", field 2=" + this.field +
				", 1개당 가격=" + this.price +
				", 총 개수=" + this.count +
				", 총 가격=" + this.total +
				'}';
	}
}

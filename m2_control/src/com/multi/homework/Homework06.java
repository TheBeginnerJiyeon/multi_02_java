package com.multi.homework;

import java.util.Date;

public class Homework06 {
	//date 이용
	
	public static void main(String[] args) {
		
		//1
		Date now = new Date();
		int year = now.getYear() + 1900;
		
		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}
		
		
		//2
		
		int days = now.getDay();
		
		switch (days) {
			case 0, 6:
				System.out.println("쉬~~~~~~~~자");
			
			default:
				System.out.println("열~~심히 공부하자");
		}
		
		
		//3
		int month = now.getMonth() + 1;
		
		
		switch (month) {
			
			case 2:
				System.out.println("28일까지");
				break;
			
			case 4, 6, 9, 11:
				System.out.println("30일까지");
				break;
			
			default:
				System.out.println("31일까지");
				break;
		}
		
		
	}
	
	
}

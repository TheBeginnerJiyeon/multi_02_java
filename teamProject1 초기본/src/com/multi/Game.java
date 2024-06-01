package com.multi;

import javax.swing.*;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game extends JFrame {
	
	Scanner sc;
	private Date start;
	private Date now;
	private int spentTime;
	static int time;
	
	
	private int setNum() {
		try {
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			return num;
		} catch (InputMismatchException e) {
			System.out.println("[ERROR] 숫자를 입력해주세요.");
		}
		return 0;
	}
	
	public int Meun(int i, int item) {//i은 레벨
		
		
		int soc = 0;
		switch (i) {
			case 1:
				soc = level(10, 2);
				break;
			case 2:
				soc = level(10, 4);
				break;
			case 3:
				soc = level(50, 4);
				break;
		}
		switch (item) {
			
			case 1:
				soc = soc * 2;
				
				break;
			case 2:
				soc = level(10, 4);
			case 3:
				soc = level(100, 4);
		}
		
		
		return soc;
	}
	
	private class GameT extends Thread {
		private Date start;
		private Date now;
		private int spentTime;
		
		@Override
		public void run() {
			
			
			start = new Date();
			
			try {
				while (time <= 10) {
					
					now = new Date();
					spentTime = (int) (now.getTime() - start.getTime()) / 1000;
					time++;
					String content = "현재 시각: " + now + "\n" + "경과 시간: " + spentTime + "\n";
					System.out.println(content);
					
					if (spentTime == 3) {
						System.out.println("3초 경과!!" + time + "\n");
						
						
					} else if (spentTime == 5) {
						System.out.println("5초 경과!!" + "\n");
						
					} else if (spentTime == 7) {
						System.out.println("7초 경과!!" + "\n");
						
					} else if (spentTime >= 10 && spentTime % 5 == 0) {
						System.out.println("10초 경과. 다음 문제로 넘어 감니다" + "\n");
						break;
					}
					sleep(1000);
				}
				
			} catch (InterruptedException e) {
				System.out.println("강제 종료합니다...");
			}
			System.out.println("종료" + time);
			
			
		}
		
	}
	
	private int level(int round, int operations) {
		Random r = new Random();
		GameT game;
		int sum = 0;
		int sum1 = -2000;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			game = new GameT();
			int x = r.nextInt(round) + 1;
			int y = r.nextInt(round) + 1;
			int mu = r.nextInt(operations) + 1;
			String str = null;
			switch (mu) {
				
				case 1:
					sum = x + y;
					str = x + "+" + y + "=";
					System.out.print(str);
					break;
				case 2:
					sum = x - y;
					str = x + "-" + y + "=";
					System.out.print(str);
					break;
				case 3:
					sum = x * y;
					str = x + "*" + y + "=";
					System.out.print(str);
					
					break;
				case 4:
					while (true) {
						if (x % y == 0) {
							break;
						}
						x = r.nextInt(round) + 1;
						y = r.nextInt(round) + 1;
					}
					sum = x / y;
					str = x + "/" + y + "=";
					System.out.print(str);
					
					break;
				
				
			}
			game.start();
			
			while (time < 10) {
				
				try {
					sum1 = setNum();
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("[ERROR] 숫자를 입력해주세요.");
					
				}
				System.out.print(str);
			}
			game.interrupt();
			System.out.println();
			
			if (sum == sum1) {
				System.out.println("정답입니다");
				count++;
			} else {
				
				System.out.println("오답입니다");
				System.out.println("정답은 " + sum + "입니다");
			}
			time = 0;
			System.out.println();
			
		}
		return count;
	}
	
	
}

package com.multi.practice.beep;

public class Ex5 {
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작"+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: "+threadB.getName());
		threadB.start();
		
		
		
		
	}
	
	
	
}

package com.multi.practice.daemon;

public class DaemonExample {
	public static void main(String[] args) {
		
		AutoSavedThread autoSavedThread = new AutoSavedThread();
		autoSavedThread.setDaemon(true);
		autoSavedThread.start();
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e){}
		
		System.out.println("메인 스레드 종료");
		
		
		
		
	}
	
	
}

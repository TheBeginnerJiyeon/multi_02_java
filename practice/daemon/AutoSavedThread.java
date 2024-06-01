package com.multi.practice.daemon;

public class AutoSavedThread extends Thread{
	public void save(){
		System.out.println("작업 내용을 정리함");
	}
	
	@Override
	public void run(){
		
		while (true){
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e){}
			
			save();
			
		}
		
		
		
		
	}
	
	
	
}

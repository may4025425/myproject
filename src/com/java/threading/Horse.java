package com.java.threading;

public class Horse extends Thread {
	@Override
	public void run(){
		
		for (int i=0; i<=50000;i++){
			System.out.println(getName()+":"+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

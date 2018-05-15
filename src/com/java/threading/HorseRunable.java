package com.java.threading;

public class HorseRunable implements Runnable{
	@Override
	public void run(){
		Horse h1 = new Horse();
		h1.start();
		HorseRunable h2 = new HorseRunable();
		Thread thr = new Thread(h2);
		thr.start();
		try {
			h1.join();
			thr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ended");
		
		/*for (int i=0; i<=100;i++){
			System.out.println("R:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
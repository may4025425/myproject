package com.java.threading;

import java.util.ArrayList;
import java.util.List;

public class Racing {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.start();
		HorseRunable h2 = new HorseRunable();
		Thread thr = new Thread(h2);
		thr.start();
		/*List<Horse> horses = new ArrayList<>();
		for(int i =0;i<8;i++){
			Horse h = new Horse();
			horses.add(h);
			h.start();
		}*/
		
		
		/*Horse h1 = new Horse();
		Horse h2 = new Horse();
		h1.start();
		h2.start();*/
	}

}

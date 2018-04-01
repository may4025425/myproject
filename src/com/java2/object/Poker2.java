package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	String flowers = "SHDC";
	ArrayList<Integer> cards = new ArrayList<>();
	public Poker2() {
				for (int i = 0; i <= 52; i++) {
				cards.add(i);
				}
	}	
	public void shuffle(){
				for(int i=0 ;i<=52;i++){
					int j = random.nextInt(52);
					cards.set(i, j);	
				}
			}
	public void print() {
				for (int i=0;i<=52;i++) {
					int c= cards.get(i);
					System.out.print((c % 13) + 1 + "" + (flowers.charAt(c / 13)));
					if(i%13 == 0){
					System.out.println(" ");	
					}
				}
			}
		}
	


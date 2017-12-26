package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			Random r = new Random();
			int r1 = (r.nextInt(6) + 1);
			int r2 = (r.nextInt(6) + 1);
			int r3 = (r.nextInt(6) + 1);
			int r4 = (r.nextInt(6) + 1);
			
			if(r1!=r2&r2!=r3&r3!=r4&r1!=r4&r1!=r3&r1!=r4&r2!=r4){
			System.out.println(r1+" "+r2+" "+r3+" "+r4+"*");
			}else{
				System.out.println(r1+" "+r2+" "+r3+" "+r4);
			}
			
			

			}
			
		}

	}



package com.fju.mid;

public class score {

	public static void main(String[] args) {
		int score = 90;
		System.out.println(score/10);
		int i = score/10;
		switch(i){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		case 6:
			System.out.println("Passed");
			break;
		case 7:
			System.out.println("Good");
			break;
		case 8:
			System.out.println("Great");
			break;
		case 9:
			System.out.println("Excellent");
			break;
		}
		
			
		
	}

}

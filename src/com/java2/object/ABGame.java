package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		
		String secret = "9873";
		String nums = "1356";
		//String nums = "2467";
		//String nums = "8902";
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(System.in);
		while(a!=4) {
			a = 0;//要記得歸零
			b = 0;
		System.out.print("Please enter your guess");
		String num = scanner.nextLine();
		int length = secret.length();
		/*下面那一行：拿nums去和secret比較，把nums當外迴圈*/
		for(int i=0; i<nums.length(); i++) {
			char c = nums.charAt(i);
			for(int j=0; j<secret.length();j++) {
				if(c == secret.charAt(j)) {
					if(i == j) {
						a++;
					}else {
						b++;
					}
					break;
				}
			}
	
		}
		System.out.println(a+"A"+b+"B");
	}
	}
	

}

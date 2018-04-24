package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = ("1234");
		int a = 0;
		int b = 0;
		while(a!=4) {
		a=0;
		b=0;
		System.out.println("請輸入你要猜的數字:");
		String s2 = scan.nextLine();
		for (int i = 0; i < s2.length(); i++) {
			int c = s2.charAt(i);
			for (int j = 0; j < s1.length(); j++) {
				if (c == s1.charAt(j)) {
					//下面那步很重要
					if(i==j) {
						a++;
					}else {
					b++;
				}
			}
		}
		}
		System.out.print(a+"A"+b+"B");}

		/*
		 * String secret = "9873"; 
		 * //String nums = "1356"; 
		 * //String nums = "2467";
		 * //String nums = "8902"; 
		 * int a = 0; 
		 * int b = 0; 
		 * Scanner scanner = new Scanner(System.in); 
		 * while(a!=4) { 
		 * a = 0;//要記得歸零 
		 * b = 0;
		 * System.out.print("Please enter your guess:"); 
		 * String nums = scanner.nextLine(); 
		 * //int length = secret.length();
		 * //下面那一行：拿nums去和secret比較，把nums當外迴圈 
		 * for(int i=0; i<nums.length(); i++) { 
		 * char c = nums.charAt(i); 
		 * for(int j=0; j<secret.length();j++) { 
		 * if(c == secret.charAt(j)) { 
		 * if(i == j) { 
		 *	 a++;
		 * }else { 
		 * b++;
		 *  } break; }
		 * 
		 * } } System.out.println(a+"A"+b+"B"); }
		 */
	}
}

package com.java2.object;

import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		String s1 ="1234";
		Scanner scan = new Scanner(System.in);
		int result = 0;
		while(result!=40) {
		System.out.print("請輸入你猜測的數：");
		ABNumber n = new ABNumber(scan.nextLine());
		result = n.validate(s1);
		System.out.println((result/10)+"A"+(result%10)+"B");
		}
		/*String secret ="9873";
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		while (result != 40) {
			System.out.print("Please enter your guess");
			ABNumber n = new ABNumber(scanner.nextLine());
			result = n.validate(secret);
			System.out.println((result/10)+"A"+(result%10)+"B");
		}*/
		
	}
}

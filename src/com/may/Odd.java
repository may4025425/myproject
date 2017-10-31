package com.may;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
		Scanner scan = new Scanner(System.in);
		String line  = scan.nextLine();
		int n = Integer.parseInt(line);//將字串轉為整數
		if(n % 2 == 1){
			System.out.println("是奇數");
			}
		else{
			System.out.println("是偶數");
		}
	}

}

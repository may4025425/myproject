package com.may;

import java.util.Scanner;

public class AgeTester {

	public static void main(String[] args) {
		
		System.out.println("請輸入你的年齡:");
		Scanner scan = new Scanner(System.in);
		String  line = scan.nextLine();
		int n = Integer.parseInt(line);
		if(n < 12){
			System.out.println("小學?");}
		else if(n < 15){
			System.out.println("中學?");}
			else if (n < 18){
				System.out.println("高中?");}
				else{
					System.out.println("........");
				}
			}
		}


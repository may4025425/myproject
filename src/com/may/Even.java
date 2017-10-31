package com.may;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
        System.out.println("請輸入一個整數:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        /*String line = scan.nextLine();
        int n = Integer.parseInt(line);*/
        if(n % 2 == 1){
        	System.out.println("是奇數");
        }
        else
        	
    		System.out.println("是偶數");
	}

}

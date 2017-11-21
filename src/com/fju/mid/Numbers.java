package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		  int i = 1;
			while(i <= n){
				System.out.print(i+" ");
				i++;
			if(i % 5 == 0){
					System.out.print("*" );//五的倍數前面加一個星號
				}
			if(i > 10){
			break;//印到10停止
			
		}
		
	}

}
}
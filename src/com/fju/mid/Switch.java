package com.fju.mid;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		switch (i) {//括號內是輸入一個值且如果沒有break
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default://用於其他的的方案,想假如你想要輸入0和7都是印出星期日或是想要輸入除了1~7外數字都印出別的東東,都可用此方法
			System.out.println("輸入錯誤");
		}
	}

}

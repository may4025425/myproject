package com.fju.mid;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = -1;
		while (i != 0) {
			System.out.println("請輸入方向:");
			String line = scan.nextLine();
			i = Integer.parseInt(line);
			//int i = scan.nextInt(); 為何此方法不行??
			switch (i) {
			case 4:
				System.out.println("向左");
				break;
			case 2:
				System.out.println("向下");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 0:
				System.out.println("Bye");
				break;
			}
		}

	}
}
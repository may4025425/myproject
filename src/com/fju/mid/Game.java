package com.fju.mid;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hp =100;
		int pos = 0;
		int row = 3;
		int column = 5;
		
		int i = -1;
		while (i != 0) {
			System.out.println("目前位置"+pos+"HP"+hp);
			System.out.println("請輸入方向:");
			String line = scan.nextLine();
			i = Integer.parseInt(line);
			// int i = scan.nextInt(); 為何此方法不行??
			switch (i) {
			case 4:
				System.out.println("向左");
				if(pos % column !=0){
					pos = pos - 1;
					hp = hp-5;
				}else{
					hp = hp-30;
				}
				break;
			case 2:
				System.out.println("向下");
				if(pos / column < row -1 ){
					pos = pos + column;
					hp  = hp-5;
				}else{
					hp = hp-30;
				}
				break;
			case 6:
				System.out.println("向右");
				if(pos % column != column - 1){
					pos = pos +  1;
					hp = hp-5;
				}else{
					hp = hp-30;
				}
				break;
			case 8:
				System.out.println("向上");
				if (pos / column < row - 1) {
					pos = pos + column;
					hp  = hp-5;
				}else{
					hp = hp-30;
				}
				break;
			case 0:
				System.out.println("Bye");
				break;
			}
		}

	}
}
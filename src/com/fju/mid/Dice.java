package com.fju.mid;

public class Dice {

	public static void main(String[] args) {
		/*
		 * int n[] = new int [3]; n[0] = 4; n[1] = 5; n[2] = 6; for(int i = 0 ;
		 * i < 3 ; i++){ System.out.println(n[i]); }
		 */
		// 這是way 1

		/*
		 * int n [] = {4,5,6}; for(int i = 0; i<3; i++){
		 * System.out.println(n[i]);
		 */
		// 這是way 2

		/*int n[] = { 4, 5, 6, 7, 8, 9 };
		n[0] = 4;
		n[1] = 5;
		n[2] = 6;
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		} */// 這是length的用法(代表陣列的元素個數)
		
		int n[] = {4,5,6,7,8,9};
		for(int i : n){
			System.out.println(i);
		}//這是for-each迴圈的用法

	}

}

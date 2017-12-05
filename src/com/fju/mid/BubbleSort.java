package com.fju.mid;

public class BubbleSort {

	public static void main(String[] args) {
		// {51,23,6,65,15}如果右邊的值比左邊大,就要交換
		int n[] = { 51, 23, 6, 65, 15 };
		//           0   1  2   3   4
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				System.out.println(i + "," + j);// 這行是用來印證你的方法對不對
				if (n[i] > n[j]) {
					int tmp = n[i];// 先給A儲存一個值
					n[i] = n[j];// 再將B儲存到A
					n[j] = tmp;// 最後再將新的值儲存到B
				}
			}
		}
		for (int num : n) {
			System.out.print(num + " ");
		}
	}
}

/*
 * 關於a和b互換值的寫法(兩個值互換的方法) int a = 3; int b = 2; int tmp = a; a = b; b=tmp;
 */

// 氣泡分類法:內迴圈和外迴圈的應用還有利用交換值 --必定要會!

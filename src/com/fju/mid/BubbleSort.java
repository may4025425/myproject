package com.fju.mid;

public class BubbleSort {

	public static void main(String[] args) {
		// {51,23,6,65,15}如果右邊的值比左邊大,就要交換
		int n[] = {51,23,6,65,15};
		for (int i = 0 ; i < n.length; i++){
			if(n[i] < n[i+1])//這有問題!!!
			System.out.print(n[i]+" ");
			
			}
		}
		
		/* 關於a和b互換值的寫法
		int a = 3;
		int b = 2;
		int tmp = a;
		a = b;
		b=tmp;*/
	}



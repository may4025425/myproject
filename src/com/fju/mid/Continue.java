package com.fju.mid;

public class Continue {

	public static void main(String[] args) {
		//continue用法
		for(int i = 1;i <= 13; i++){
			if(i % 3 == 0){
				continue;
			}
			System.out.print(i + " ");//(" ")空一格
		}System.out.println();//跳一排
		int n=1;
		while(n <= 13){
			//System.out.print(n + " ");
			if(n % 3 == 0){
				continue;
			}
			System.out.print(n + " ");
			n++;
		}
		
		
		
		
	
	}

}

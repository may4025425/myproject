package com.fju.mid;

public class ScoreArray {

	public static void main(String[] args) {
		//這方法必須知道個數且不可途中增加項目,所以很難用
		int m[][] = new int[5][3];
		m[0][0]= 55;
		m[0][1]= 65;
		m[0][2]= 75;
		
		m[1][0]= 85;
		m[1][1]= 95;
		m[1][2]= 15;
		
		m[2][0]= 25;
		m[2][1]= 35;
		m[2][2]= 45;
		
		m[3][0]= 55;
		m[3][1]= 65;
		m[3][2]= 75;
		
		m[4][0]= 85;
		m[4][1]= 95;
		m[4][2]= 15;
		
		for (int i=0;i<5;i++){
			System.out.print(m[i][0]+"\t"+m[i][1]+"\t"+m[i][2]+"\t"); // "\t"= 空一格
			int average = (m[i][0]+m[i][1]+m[i][2])/3;//將平均儲存到一個值
			if(average < 60){
				System.out.println("*"+average);
			}else{
				System.out.println(average);
			}
		}
	}

}

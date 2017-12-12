package com.may.oo;

public class Student {//沒有定義main方法(method),都會固定繼承到java.lang.Object中 
					  //class下放的是屬性(property or field)
	
	int english;/* 這步驟叫做設計(定義)一個物件,他會儲存到磁碟機中,因此Tester中的stu.就可以有math.....之類的東西使用(以後都能用了) */
	int math;
	int chinese;
	String name;
	//instance variable(屬性)
	//class like a 藍圖  instance的用途是來舉例
	
	public Student(String name, int english,int math, int chinese){
		this.name = name;
		this.english = english;
		this.math = math ;
		this.chinese = chinese;
	}//建立建構子 記得名稱要和類別一樣(like:Student)
	//local variable
	
	public Student(String n){
		this.name =  n;
	}//所以建構子可以不只一個;
	//this是強調Student中的instance variable 有時候建構子會為了說明清楚
	//,然後名稱會和屬性一樣 所以加了this 之後就會代表是屬性中東東了
	
	public void print(){
		System.out.println(english + "\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return (english + math + chinese)/3;
	}//return 回傳值 
	}



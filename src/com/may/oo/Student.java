package com.may.oo;

public class Student {//沒有定義main方法(method),都會固定繼承到java.lang.Object中 
					  //class下放的是屬性(property or field)
	
	int english;/* 這步驟叫做設計(定義)一個物件,他會儲存到磁碟機中,因此Tester中的stu.就可以有math.....之類的東西使用(以後都能用了) */
	int math;
	int chinese;
	String name;
	
	public Student(String n, int e,int m, int c){
		name = n;
		english = e;
		math = m ;
		chinese = c;
	}//建立建構子 記得名稱要和類別一樣(like:Student)
	
	public void print(){
		System.out.println(english + "\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return (english + math + chinese)/3;
	}//return 回傳值
	}



package com.may.oo;

public class Tester {

	public static void main(String[] args) {
		//Student stu = new Student("黃曉明",55,66,77);//建立物件,儲存到stu中
		Student stu = new Student("黃曉明");
		stu.english = 55;
		stu.math = 66;
		stu.chinese = 77;
		stu.method();
		stu.print();
		int avg = stu.getAverage();
		System.out.println(stu.name+":"+avg);
	}

}

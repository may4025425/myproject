package com.may.oo;

public class Tester2 {
	public static void main(String[] args) {
	Student stu1 = new Student("王曉明",55,66,77);
	Student stu2 = new Student("黃曉明",55,66,77);
	stu1.pass = 50;//pass是通用的,所以就算只改在stu1,stu2也會被改變成50
	stu1.print();
	stu2.print();
	int avg = stu1.getAverage();
	System.out.println(stu1.name+":"+avg);
	Student.method();
	GraduateStudent gstu = new GraduateStudent();
	gstu.print();
}
	
}

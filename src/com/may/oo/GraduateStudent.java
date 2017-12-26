package com.may.oo;

public class GraduateStudent extends Student {
	int thesis;
	//extends的意思相當於擴充或繼承(某類別)
	// why GraduateStudent 會出錯?
	// 因為必須要在Student類別中建立一個空的建構子(因為本來沒建立他會送,但當你建立了他就不會送了)
	// 空的建構子長這樣:public Student(){ }(必考)(重要)
	//debug後你會發現他round的順序是GraduateStudent會找到Student中的空建構子然後發現是空的再跳回GraduateStudent發現也是空的再跳回Tester2 的gstu.print();最後印出Student中的public void print(){
	//System.out.println(english + "\t"+math+"\t"+chinese);
	//System.out.println(pass);}


}

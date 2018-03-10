package com.may.oo;

public class GraduateStudent extends Student {
	int thesis;
	public  GraduateStudent(String name, int english,int math, int chinese){
		super();//只能放在第一行,()代表建構子,super代表父類別
	}
	//子類別是可以複寫父類別的東西的,這時候會有個防呆裝置"@Override",會幫你看你是否有複寫對,主要是用來添加除了父類別以外的東西
	//@的意思是"annotation標示"
	
	@Override
	public void print(){
		//super.print();  再印一次父類別的print()
		System.out.println(english + "\t"+math+"\t"+chinese+"\t"+thesis);
		System.out.println(pass);
	}
	//"super."代表使用父類別中的屬性或方法,所以印出來的結果會先印出父類別的,再印出子類別的
	@Override
	public int getAverage(){
		return(english + math + chinese+thesis)/4;
	}
	

	
	
	
	
	
	
	
	
	
	
	/*	
	 	extends的意思相當於擴充或繼承(某類別)
	 	
		why GraduateStudent 會出錯?
	 	因為必須要在Student類別中建立一個空的建構子(因為本來沒建立他會送,但當你建立了他就不會送了)
	 	
	 	空的建構子長這樣:public Student(){ }(必考)(重要)
		
		debug後你會發現他執行的順序是GraduateStudent會找到Student中的空建構子然後發現是空的再跳回GraduateStudent發現也是空的再跳回Tester2 的gstu.print();最後印出Student中的public void print(){
		System.out.println(english + "\t"+math+"\t"+chinese);
		System.out.println(pass);}
		
		2018.1.2:在Student類別中的int english 前加上"private",繼承Student類別的 GraduateStudent就會無法使用english
		2018.1.2:如果將類別 GraduateStudent拉到不同的package,就算是父子類別,int english前沒有加上"public"的話,都無法使用(方法也同樣適用,像是:public void print()
		2018.1.2:如果將類別 GraduateStudent拉到不同的package,想要讓父類別(Student)想讓他自己的小孩(GraduateStudent)也能使用english,這時,在int english前面加上"protected"="保護小孩的意思",(能用的包括他的小孩和同個package中的類別),這時GranduateStudent也能用了(方法也同樣適用,像是public void print()
		2018.1.2:Polymorphism多型
				 Inheritance繼承
				 Encapsulation封裝
		*/


}

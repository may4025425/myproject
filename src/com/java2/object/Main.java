package com.java2.object;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<BookMember>bm = new ArrayList<>();
		bm.add(new GeneralMember("林俊傑","（一般會員）",500,100,0.2f,"JJLin@gmail.com","0934619876","台北市"));
		bm.add(new GoldenMember("周渝民","（黃金會員）",1000,500,0.3f," maybeyouknow@gmail.com","0924609806","台北市"));
		bm.add(new PlatinumMember("金城武","（白金會員）",3000,2000,0.4f,"Idontknow@gmail.com","0914619076","台北市"));
		bm.add(new DiamondMember("周杰倫","（鑽石會員）",100,1000,0.5f,"canyougiveme@gmail.com","0924619906","台北市"));
		for(int i = 0; i<bm.size();i++){
			BookMember b = bm.get(i);
			b.print1();
			b.print2();
		}
	}
	
}

//"會員信箱: "+"JJLin@gmail.com"+"\t"+"手機號碼: "+"0934619876"+"\t"+"運送地址： "+"台北市")
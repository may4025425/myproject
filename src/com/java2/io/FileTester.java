package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileTester {
	//可以多個 Stream 和 txt，而且txt裡的內容可以隨意更改後，在儲存。
	//fileoutstream裡沒有print方法
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("data.txt",true);
			for (int i = 65; i <= 90; i++) {
				fos.write(i);
			PrintStream out = new PrintStream("data2.txt");
				out.print(" ");
				fos.flush();
			}
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

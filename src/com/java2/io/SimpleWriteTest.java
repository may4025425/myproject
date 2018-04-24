package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream("data.txt");
		ps.print("竺佩蓁\t 04\t25\t1000元");
		ps.flush();
		ps.close();
	}
	/*public static void main(String[] args) throws FileNotFoundException  {
	
		PrintStream out = new PrintStream("data.txt");
		 out.println("MAY CHU\t 1\t1000");
		 out.flush();
		 out.close();

	}*/

}

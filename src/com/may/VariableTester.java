package com.may;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
        int age = 0;
        float weight = 69.5f;
        char c = 65;
        char c2 = 'Z';
        boolean pass = true;
        System.out.println(!pass);
        System.out.println(pass);
      
        
        Random r = new Random();
        System.out.println(r.nextInt(6)+1);
        System.out.println(3 >= 2);
        String s = new String("Hello");
        String s2 = "HAHA";
        int len = s.length();
        System.out.println("len:"+len);
        System.out.println(s.charAt(0));
        
        float f = 5.0f;
        int x = 5;
        int y = 3;
        int z = (int)(f%y);//轉型(int)
        System.out.println(z);
        System.out.println(x >> 1);
        x = x+1;
        x++;
        x--;
        System.out.println(x);
        x = x+2;
        x += 2;
        System.out.println(x);
	}

}

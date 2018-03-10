package com.may.sogo;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));
		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			c.print();
		}

		/*
		 * 第二種中階寫法
		 * 
		 * Customer c1 = new Customer(10000); SilverCustomer c2 = new
		 * SilverCustomer(10000); GoldenCustomer c3 = new GoldenCustomer(10000);
		 * c1.print(); c2.print(); c3.print();
		 */

		/*
		 * 第三種比較不好的寫法 Customer c1 = new Customer(1000); c1.print(); SilverCustomer c2 =
		 * new SilverCustomer(1000); c2.print();
		 * 
		 */

		ArrayList list = new ArrayList();// ArrayList = 集合
		list.add(94);// 有點像陣列,但他放多少都可以
		list.add(87);
		list.add(55);
		list.add(4.2);// 他是double不是float,float要加f
		list.add("aa");
		int n = (int) list.get(2);// 要轉型
		String s = (String) list.get(4);// 要轉型
		list.remove(2);// 將55摘走
		System.out.println(list.get(0));// 取得他的值
		System.out.println(list.size());// 有多寬=有多少個(補)知道他有多少個,就可以用for迴圈了
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/*
		 * 如果你的資料都是同質,你可以都括在<Integer>整數泛型中 ArrayList<Integer> list = new
		 * ArrayList<Integer>(); 上一行也可寫成ArrayList<Integer> list = new ArrayList<>();
		 * list.add(94); list.add(87); list.add(55); list.add(4); list.add(5); int n =
		 * list.get(2);所以這行就不用再用(int)變型
		 */

	}
}
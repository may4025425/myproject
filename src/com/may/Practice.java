package com.may;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int n = 5;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
			if (prime) {
				System.out.println(n + " is prime number!");
			} else {
				System.out.println(n + " not prime ");
			}
		}
	}

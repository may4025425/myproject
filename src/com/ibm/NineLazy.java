package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for (int n = 1; n <= 3; n++) {
			for (int i = 2; i <= 9; i++) {

				if (n * i < 10) {
					System.out.print(i + " * " + n + " = " + n * i + "\t");

				} else {
					System.out.print(i + " * " + n + " = " + n * i + "\t");
				}
			}

			System.out.println();

		}
		for (int j = 1; j <= 5; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print("..." + "\t" + "\t");
			}
			System.out.println();
		}
		for (int n = 2; n <= 9; n++) {

			System.out.print(n + " * " + "9" + " = " + n * 9 + "\t");
		}
	}

}

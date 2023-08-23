package Ejaz_bhai_task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class read_csv_file {

	void A() {
		int n = 5;

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == 1 || i == 7 / 2 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	public static void E() {
		int n = 5;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j == 1 || i == 5 || i == 1 || i == 3 || j == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	public static void S() {
		int n = 5;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || i + j == n + 1 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {

		// E();
		// System.out.println();

		// S();
		int a = 1;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == a||j==1&&i==2||j==5&&i==4||i==n||i==n/2+1) {
					System.out.print("* ");
					
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

	}

}

package com.gl.paymoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the transaction array : ");
		int size = scanner.nextInt();

		int[] transactions = new int[size];
		System.out.println("Enter the Value of array : ");
		for (int index = 0; index < size; index++) {
			transactions[index] = scanner.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved : ");
		int numOfTarget = scanner.nextInt();

		while (numOfTarget-- != 0) {
			int flag = 0;
			long target;
			System.out.println("enter the value of target");
			target = scanner.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += transactions[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + "transactions ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(" Given target is not achieved ");
			}

		}

	}
}

package com.gl.paymoney;

public class TargetDeterminatorTestV2 {

	public static void main(String[] args) {

		genericsenerio(new int[] { 20, 12, 31 }, 21);
		genericsenerio(new int[] { 20, 12, 31 }, 19);
		genericsenerio(new int[] { 100 }, 101);
		genericsenerio(new int[] { 25, 35, 55 }, 115);
		genericsenerio(new int[] { 25, 35, 55 }, 115);

	}

	static void genericsenerio(int transactionsArray[], int dailyTarget) {

		TargetDeterminator determinator = new TargetDeterminator(transactionsArray, dailyTarget);

		Result result = determinator.determine();

		System.out.println("Target Achieved --> " + result.isTargetAchievedOrNot());
		System.out.println("No of Transactions -- > " + result.getNoOfTransactions());
	}
}

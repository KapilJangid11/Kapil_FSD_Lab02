package com.gl.paymoney;

public class TargetDeterminatorTest {
	
	public static void main(String[] args) {
		
		senerio5();

	}

	static void senerio1() {
		
		int transactionsArray [] = {20, 12, 31};
		int dailyTarget = 21;
		
		TargetDeterminator determinator 
			= new TargetDeterminator(transactionsArray, dailyTarget);
		
		Result result = determinator.determine();
		
		System.out.println("Target Achieved --> " + result.isTargetAchievedOrNot());
		System.out.println("No of Transactions -- > " + result.getNoOfTransactions());
	}
	
		static void senerio2() {
		
		int transactionsArray [] = {20, 12, 31};
		int dailyTarget = 19;
		
		TargetDeterminator determinator 
			= new TargetDeterminator(transactionsArray, dailyTarget);
		
		Result result = determinator.determine();
		
		System.out.println("Target Achieved --> " + result.isTargetAchievedOrNot());
		System.out.println("No of Transactions -- > " + result.getNoOfTransactions());
	}
		static void senerio3() {
			
			int transactionsArray [] = {100};
			int dailyTarget = 101;
			
			TargetDeterminator determinator 
				= new TargetDeterminator(transactionsArray, dailyTarget);
			
			Result result = determinator.determine();
			
			System.out.println("Target Achieved --> " + result.isTargetAchievedOrNot());
			System.out.println("No of Transactions -- > " + result.getNoOfTransactions());
		}
		
		static void senerio4() {
			
			int transactionsArray [] = {25, 35, 55};
			int dailyTarget = 115;
			
			TargetDeterminator determinator 
				= new TargetDeterminator(transactionsArray, dailyTarget);
			
			Result result = determinator.determine();
			
			System.out.println("Target Achieved --> " + result.isTargetAchievedOrNot());
			System.out.println("No of Transactions -- > " + result.getNoOfTransactions());
		}
		

		static void senerio5() {
			
			int transactionsArray [] = {25, 35, 55};
			int dailyTarget = 116;
			
			TargetDeterminator determinator 
				= new TargetDeterminator(transactionsArray, dailyTarget);
			
			Result result = determinator.determine();
			
			System.out.println("Target Achieved --> " + result.isTargetAchievedOrNot());
			System.out.println("No of Transactions -- > " + result.getNoOfTransactions());
		}
}

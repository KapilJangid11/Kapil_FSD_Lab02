package com.gl.paymoney;

public class TargetDeterminator {
	
	private int [] noOfTransactionsCountArray;
	private int dailyTarget;
	
	Result result = new Result();
	
	public TargetDeterminator (
			int [] noOfTransactionsCountArray,
			int dailyTarget) {
		
			this.noOfTransactionsCountArray = noOfTransactionsCountArray;
			this.dailyTarget = dailyTarget;
			
		
	}
	public Result determine(){
		
		int tempValue = 0;
		
		for(int index = 0; index < noOfTransactionsCountArray.length; index++) {
			
			int noOfTransactions = noOfTransactionsCountArray[index];
			
			tempValue = tempValue + noOfTransactions;
			
			if(tempValue >= dailyTarget) {
				
				result.setNoOfTransactions((index+1));
				result.setTargetAchievedOrNot(true);
				
				break;
			}
			
		}
		
		if(!result.isTargetAchievedOrNot()) {
			result.setNoOfTransactions(-1);
		}
			
		return result;
	}

}

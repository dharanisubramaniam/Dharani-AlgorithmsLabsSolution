package com.greatlearning.service;

public class TransactionTarget {
     public void isTargetAchieved(int[] prefixSum,int targetValue) {
    	 //using sum variable
			/*
			 * int sum=0; for(int i=0;i<transactionArray.length;i++) {
			 * sum+=transactionArray[i]; if(sum>=targetValue) {
			 * System.out.println("Target is achieved in "+(i+1)+" transactions"); return; }
			 * 
			 * }
			 * System.out.println("Target is unachievable with the given no of transactions"
			 * );
			 */
    	 
    	 
    	 //using prefixSum
    	 for(int i=0;i<prefixSum.length;i++) {
    		 if(prefixSum[i]>=targetValue) {
    			 System.out.println("Target is achieved in "+(i+1)+" transactions"); 
    			 return;
    		 }
    	 }
    	 System.out.println("Target is unachievable with the given no of transactions");
     }
}

package com.greatlearning.main;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.service.TransactionTarget;

public class Driver {
	public static void main(String args[]) {
		TransactionTarget transactionTarget = new TransactionTarget();
		
		//getting the size of transaction array
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int noOfTransactions = scanner.nextInt();
		
		//initializing transaction array
		int[] transactionArray = new int[noOfTransactions];
		getTransaction(scanner,transactionArray);
		printArray(transactionArray);
		
		//getting the no of targets
		System.out.println("Enter the total no of targets that need to be achieved");
		int totalNoTargets = scanner.nextInt();
		
		//calculating prefix sum
		int[] prefixSum =new int[noOfTransactions];
		prefixSum[0]=transactionArray[0];
		for(int i=1;i<noOfTransactions;i++) {
			prefixSum[i]=prefixSum[i-1]+transactionArray[i];
		}
		printArray(prefixSum);
		
		//calling isTargetAchieved for the given no of targets
		for(int i=0;i<totalNoTargets;i++) {
			System.out.println("Enter the target value");
			int targetValue = scanner.nextInt();
			transactionTarget.isTargetAchieved(prefixSum,targetValue);
		}
		
	}

	private static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
		
	}

	private static void getTransaction(Scanner scanner,int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i] = scanner.nextInt();
			
		}
		
	}

}

package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.service.MergeSort;
import com.greatlearning.service.PaymentApproach;



public class Driver {
	public static void main(String args[]) {
		MergeSort mergeSort =new MergeSort();
		PaymentApproach paymentApproach = new PaymentApproach();
		
		//getting the size of denomination array
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the currency denominations");
		int denominationArraySize = scanner.nextInt();
		
		//initializing denomination array
		int[] denominationArray = new int[denominationArraySize];
		getTransaction(scanner,denominationArray);
		printArray(denominationArray);
		
		//getting the amount
		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();
		
		//sorting the denomination values
		mergeSort.sort(denominationArray,0,denominationArraySize-1);
		printArray(denominationArray);
		
		//payment approach
		paymentApproach.notesCount(denominationArray,amount);
	}

	private static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
		
	}

	private static void getTransaction(Scanner scanner,int[] denominationArray) {
		for(int i=0;i<denominationArray.length;i++) {
			denominationArray[i] = scanner.nextInt();
			
		}
		
	}


}

package com.greatlearning.service;

public class PaymentApproach {
  public void notesCount(int[] denominationArray,int amount) {
	 int[] counter = new int[denominationArray.length];
	 if(amount>0) {
		 for(int i=0;i<denominationArray.length;i++) {
			 if(amount>=denominationArray[i]) {
				  counter[i]=amount/denominationArray[i];
				  amount -= counter[i]*denominationArray[i];
			}
			  
		  }
		  if(amount > 0) {
			  System.out.println("Cannot get the exact amount");
		  }
		  else {
			  for(int i=0;i<denominationArray.length;i++) {
				  System.out.println("Min no of notes to pay the amount "+denominationArray[i]+" : "+counter[i]);
			  }
		  }
	 }
	 else {
		 System.out.println("The given amount is not valid");
	 }
		  
	 
	  /*while(i<denominationArray.length) {
		  count =amount/denominationArray[i];
		  amount = amount - count*denominationArray[i];
		  if(amount >0) {
			 System.out.println("no of notes would be "+denominationArray[i]+" : "+count);
			
		  }
		  i++; 
		  
	  }*/
  }
}

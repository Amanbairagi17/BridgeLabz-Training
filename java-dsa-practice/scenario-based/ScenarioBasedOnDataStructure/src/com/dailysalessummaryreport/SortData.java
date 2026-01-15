package com.dailysalessummaryreport;

public class SortData {
	Transaction[] transactions = new Transaction[10];
	
	public SortData(Transaction[] transactions) {
		this.transactions = transactions;
	}
	

	public void sortTransaction() {
		int n = transactions.length;
		mergeSort(0,n-1,transactions);
	}
	
	public void mergeSort(int low, int high, Transaction[] transactions) {
		
		if(low < high) {
			int mid = low + (high-low)/2;
			
			mergeSort(low,mid,transactions);
			mergeSort(mid+1,high,transactions);
			merge(low, mid, high, transactions);
			
		}
	}
	 public void merge(int low, int mid, int high, Transaction[] transactions) {
		 int m = mid - low + 1;
		 int n = high - mid ;
		 
		 Transaction[] left = new Transaction[m];
		 Transaction[] right = new Transaction[n];
		 
		 
		 for(int i=0 ; i<m ; i++) left[i] = transactions[low + i];
		 for(int i=0 ; i<n ; i++) right[i] = transactions[mid + i + 1];
		 
		 int i = 0;
		 int j = 0;
		 int k = low;
		 
		 while(i<m && j<n) {
			 if(compare(left[i], right[j])) {
				 transactions[k++] = left[i++];
			 }
			 else {
				 transactions[k++] = right[j++];
			 }
		 }
		 
		 while(i<m)  transactions[k++] = left[i++];
		 while(j<n)  transactions[k++] = right[j++];
		 
		 
	 }
	 
	 public static boolean compare(Transaction t1, Transaction t2) {
			if(t1.getLocalDate().equals(t2.getLocalDate())) return t1.getAmount() < t2.getAmount();
			return t1.getLocalDate().isBefore(t2.getLocalDate());
		}
	
	
	
}

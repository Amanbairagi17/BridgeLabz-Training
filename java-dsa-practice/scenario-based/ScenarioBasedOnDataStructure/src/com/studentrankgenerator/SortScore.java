package com.studentrankgenerator;

public class SortScore {
	Student[] students;
	
	public SortScore(Student[] students) {
		this.students = students;
	}
	

	public void sortScore() {
		int n = students.length;
		mergeSort(0,n-1,students);
	}
	
	public void mergeSort(int low, int high, Student[] students) {
		
		if(low < high) {
			int mid = low + (high-low)/2;
			
			mergeSort(low,mid,students);
			mergeSort(mid+1,high,students);
			merge(low, mid, high, students);
			
		}
	}
	 public void merge(int low, int mid, int high, Student[] students) {
		 int m = mid - low + 1;
		 int n = high - mid ;
		 
		 Student[] left = new Student[m];
		 Student[] right = new Student[n];
		 
		 
		 for(int i=0 ; i<m ; i++) left[i] = students[low + i];
		 for(int i=0 ; i<n ; i++) right[i] = students[mid + i + 1];
		 
		 int i = 0;
		 int j = 0;
		 int k = low;
		 
		 while(i<m && j<n) {
			 if(compare(left[i], right[j])) {
				 students[k++] = left[i++];
			 }
			 else {
				 students[k++] = right[j++];
			 }
		 }
		 
		 while(i<m)  students[k++] = left[i++];
		 while(j<n)  students[k++] = right[j++];
		 
		 
	 }
	 
	 public static boolean compare(Student s1, Student s2) {
			return s1.getScore() < s2.getScore();
		}
	
	
	
}
package com.searchingalgorithm.binarysearch;

public class SearchIn2DMatrix {
	public static boolean searchInSortedMatrix(int[][] matrix, int target) {
		int n = matrix.length;
		int m = matrix[0].length;
		
		int low = 0;
		int high = n * m - 1;
		
		while(low < high) {
			int mid = high + low / 2;
			
			int row = mid / n;
			int col = mid % n;
			
			if(matrix[row][col] == target) {
				return true;
			}
			
			if(matrix[row][col] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] mat = {
	            {1, 5, 9},
	            {14, 20, 21},
	            {30, 34, 43}
	        };
	    int x = 14;
	    
	    if(searchInSortedMatrix(mat, x)) System.out.println("true");
	    else System.out.println(false);
	    
	}
}

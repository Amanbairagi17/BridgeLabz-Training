package com.queueandstack.stockspan;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
	public static ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        
        Stack<Integer> st = new Stack<>();// stack for maintain highest price of day 
        ArrayList<Integer> list = new ArrayList<>();//list for storing result
        
        for(int i=0 ; i<n ; i++){
            //pop out all element
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            
            //if stack empty()  then add index+1 
            if (st.isEmpty()) {
                list.add(i + 1);
            } else {//other wise find diffrence between peek to curent 
                list.add(i - st.peek());
            }

            st.push(i);
            
        }
        return list;
        
    }
	public static void main(String[] args) {
		int[] arr = {10, 4, 5, 90, 120, 80};
		System.out.println(calculateSpan(arr));

	}
}

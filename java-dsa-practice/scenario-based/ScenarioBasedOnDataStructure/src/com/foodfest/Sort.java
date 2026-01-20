package com.foodfest;

public class Sort {
    public static void mergeSort(FoodStall[] stalls) {
        if (stalls.length < 2) {
            return;
        }

        int mid = stalls.length / 2;

        FoodStall[] left = new FoodStall[mid];
        FoodStall[] right = new FoodStall[stalls.length - mid];

        for (int i = 0; i < mid; i++)
            left[i] = stalls[i];

        for (int i = mid; i < stalls.length; i++)
            right[i - mid] = stalls[i];

        mergeSort(left);
        mergeSort(right);

        merge(stalls, left, right);
    }

    // stable merge
    private static void merge(FoodStall[] result,
                              FoodStall[] left,
                              FoodStall[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            // stability: <= keeps original order for equal footfall
            if (left[i].getFootfall() <= right[j].getFootfall()) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }
    
    void display(FoodStall[] stall) {
    	for(FoodStall f : stall) {
    		System.out.println(f);
    	}
    }
}

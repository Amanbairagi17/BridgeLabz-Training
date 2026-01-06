//1975. Maximum Matrix Sum
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int minAbsVal = Integer.MAX_VALUE;
        int negetive = 0;

        for(int[] rows : matrix){
            for(int val : rows){
                totalSum += Math.abs(val);
                if(val < 0){
                    negetive++;
                }

                minAbsVal = Math.min(minAbsVal, Math.abs(val));
            }
        }

        if(negetive % 2 != 0){
            totalSum -= 2 * minAbsVal;
        }
        return totalSum;

    }
}
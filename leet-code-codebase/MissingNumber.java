//268. Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int naturalSum = ( n * (n+1))/2;

        for(int num : nums) totalSum += num;
        return naturalSum - totalSum;

    }
}
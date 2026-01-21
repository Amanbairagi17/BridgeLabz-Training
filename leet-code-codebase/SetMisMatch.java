//645. Set Mismatch
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+1];

        for(int i=0 ; i<n; i++){
            ans[nums[i]]++;
        }

        int[] result = new int[2];
        for(int i=0 ; i<ans.length ; i++){
            if(ans[i] == 0) result[1] = i;
            if(ans[i] > 1) result[0] = i;
        }
        return result;
    }
}
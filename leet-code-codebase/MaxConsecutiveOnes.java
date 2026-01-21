//485. Max Consecutive Ones
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int count = 0;

        // if(nums[0] == 1) count = 1;

        // for(int i=1 ; i<n ; i++){
        //     if(nums[i] == 0 ) continue;
        //     if(nums[i-1] == 1 && nums[i] == 1) count++;
        //     else{
        //         ans = Math.max(ans, count);
        //         count = 1;
        //     }
        // }
        // ans = Math.max(ans, count);
        // return ans;

        for(int i=0 ; i<n ; i++){
            if(nums[i] == 1) count++;
            else{
                ans = Math.max(count, ans);
                count = 0;
            }
        }
        ans = Math.max(count, ans);
        return ans;
    }
}
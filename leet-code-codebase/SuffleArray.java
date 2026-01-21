//1470. Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;

        int[] ans = new int[length];

        int j = 0;
        int k = n;
        for(int i=0 ; i<ans.length ; i++){
            ans[i++] = nums[j];
            if(i < length) ans[i] = nums[n];
            j++;
            n++;
        }
       // ans[lenght] = nums[n];

        return ans;
    }
}
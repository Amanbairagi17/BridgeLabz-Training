//506. Relative Ranks
class Solution {
    public void reverse(int[] nums){
        int n = nums.length ;
        int i = 0;
        int j = n - 1; 

        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        } 

        
    }
    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        reverse(arr);


        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        for(int i=0 ; i<n ; i++){
            if(i == 0){
                map.put(arr[i], "Gold Medal");
            }else if(i == 1){
                map.put(arr[i], "Silver Medal");
            }
            else if(i == 2){
                map.put(arr[i], "Bronze Medal");
            }
            else map.put(arr[i], (i+1)+"");
        }
        // System.out.println(map);
        // System.out.println(Arrays.toString(nums));

        String[] ans = new String[n];
        int k = 0;

        for(int i=0 ; i<n ; i++ ){
            ans[k++] = map.get(nums[i]);
        }
        return ans;

    }
}
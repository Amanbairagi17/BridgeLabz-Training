//169. Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;
        if(n == 1) return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) map.put(num, map.getOrDefault(num,0)+1);

        for(int key : map.keySet()){
            if(map.get(key) > n/2) return key;
        }
        return -1;
    }
}
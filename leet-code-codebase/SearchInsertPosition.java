class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        if(nums[n-1] < target) return n;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = (start + end  )/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target  ){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
           // System.out.println(start + " : " + end + " : " + idx + " : " +mid);
        }
        return start;
    }
}
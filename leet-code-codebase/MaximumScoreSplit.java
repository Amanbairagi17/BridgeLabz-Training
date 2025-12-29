class MaximumScoreSplit{
    public long maximumScore(int[] nums) {
        int n = nums.length;

        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];

        for(int i=1 ; i<n ; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        long[] suffixMin = new long[n];
        suffixMin[n-1] = nums[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            suffixMin[i] = Math.min(suffixMin[i+1], nums[i]);
        }
        // System.out.println(Arrays.toString(suffixMin));
        // System.out.println(Arrays.toString(prefixSum));

        long score = Integer.MIN_VALUE;

        for(int i=0 ; i<n-1 ; i++){
            score = (long) Math.max(prefixSum[i] - suffixMin[i+1], score);
            // System.out.println(score);
            // System.out.println(prefixSum[i]);
            // System.out.println(suffixMin[i]);
        }
        //score = (long) Math.max(prefixSum[n-1], score);
        return score;
    }
}
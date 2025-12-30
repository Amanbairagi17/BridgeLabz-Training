class ClimbingStairs {
    //memoization solved by me - Firstly solved by recursionn then write memoization
    private int solve(int n, int[] arr){
        if(n == 0)  return 1;
        if(n < 0)  return 0;

        if(arr[n] != -1) return arr[n];

        arr[n] = solve(n-2,arr) + solve(n-1, arr);
        return arr[n];
    }

    public int climbStairs(int n) {
        int[] arr = new int[n+1];

        //FOR memoization
        // for(int i=0 ; i<=n ; i++)  arr[i] = -1;
        // return (solve(n, arr));

        //bottom up by me, do not forget to write base condition
        if(n == 0) return 1;
        if(n == 1 || n == 2) return n;
        for(int i=0 ; i<=2 ; i++) arr[i] = i;

        for(int i=3 ; i<=n ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
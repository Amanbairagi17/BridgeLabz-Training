//509. Fibonacci Number
class FibonacciNumber {
    public int fib(int n) {
		//using bottom up 
        // int[] dp = new int[n+1];

        // if(n==0) return 0;

        // dp[0]=0;
        // dp[1]=1;

        // for(int i=2 ; i<=n ;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];

		// using sapce optimization
        if(n<2) return n;
        

        int prev=0;
        int prev1=1;

        int sum = prev+prev1;

        for(int i=2 ; i<=n ; i++){
            sum = prev + prev1;
            prev = prev1;
            prev1 = sum;

        }
        return prev1;
    }
}
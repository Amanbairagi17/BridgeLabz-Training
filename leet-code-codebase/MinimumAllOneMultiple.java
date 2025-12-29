class MinimumAllOneMultiple{
    public int minAllOneMultiple(int k) {
		//if number is divisible by 2 & 5 then it will never become 1111
        if(k % 2 == 0 && k % 5 == 0) return -1;
      
        int rem = 0;
		
		//logic to increase number by adding 1 at each iteration
        for(int i=1 ; i<=k ; i++){
            rem = (rem * 10 + 1) % k;
            if(rem == 0){
                return i;
            }
        }
        return -1;
    }
}
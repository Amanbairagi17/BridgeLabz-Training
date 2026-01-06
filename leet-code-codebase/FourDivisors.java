//1390. Four Divisors
class Solution {
    //Help : Mik bhai - CodeStiryWithMik
    private int sumOfFourDivisors(int num){
        int count = 0;
        int sum = 0;

        for(int fact=1 ; fact <= Math.sqrt(num) ; fact++){
            if(num % fact  == 0){
                int fact2 = num / fact;

                if(fact2 == fact){
                    count += 1;
                    sum += fact;
                }else{
                    count += 2;
                    sum += fact + fact2;
                }
//                System.out.println(fact + " " + fact2 + " " + count + " " + sum);
            }
            if (count > 4) {
                return 0;
            }

        }
        return count == 4 ? sum : 0;
    }
    public int sumFourDivisors(int[] nums) {

  // TLE : only 5 test case passed not a good solution 
        //Taking extra sapce that not required and time complexity is too high
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // int sum = 0;

        // for(int i=0 ; i<nums.length ; i++){
        //     int n = nums[i];
        //     for(int j=1 ; j  <= n ; j++){
        //         if(n % j == 0){
        //             pq.add(j);
        //             while(pq.size() > 5){
        //                 System.out.println(pq.poll());
        //             }
        //         }
        //     }
        //     System.out.println(pq);
        //     if(pq.size() == 4){
        //         while(!pq.isEmpty()) sum += pq.poll();
        //     }else{
        //         pq.clear();
        //     }
        // }
        // return sum;

        int n = nums.length;
        int ans = 0;

        for(int num : nums){
            ans += sumOfFourDivisors(num);
        }

       

        return ans;

    }
}
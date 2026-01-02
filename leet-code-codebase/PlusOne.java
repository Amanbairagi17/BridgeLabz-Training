//66. Plus One
class PlusOne {
    private boolean isAllNine(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i=0 ; i<n ; i++){
            if(arr[i] == 9) count++;
        }
        return n == count;
    }
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        if(isAllNine(digits)){
            int[] arr = new int[n+1];

            for(int i=0 ; i<n ; i++){
                if(i==0) arr[i] = 1;
                else{
                    arr[i] = 0;
                }
            }
            return arr;
        }
        
        int carry = 1;

        for(int i=n-1 ; i>=0 ; i--){
            digits[i] += carry;
            if(digits[i] > 9){
                digits[i] = 0;
                carry = 1;
            }else{
                carry = 0;
            }
        }

        return digits;
    

        
        
    }
}
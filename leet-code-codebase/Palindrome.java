class Palindrome {
    public boolean isPalindrome(int x) {
        int num = x;
        int ans = 0;

        if(x < 0) return false;

        while(num != 0){
            ans = ans * 10 + num % 10;
            num /= 10;
        }
        if(ans == x) return true;
        return false;
    }
}
class RomanToInteger {
   private Map<Character, Integer> getMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
    public int romanToInt(String s) {
        Map<Character, Integer> map = getMap();

        int ans = 0;
       
        for(int i=0 ; i<s.length()-1; i++){
            int currVal = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i+1));
            if(nextVal <= currVal) ans += currVal ;
            else ans -= currVal;
           // System.out.println( currVal + " : " + nextVal + " : " +ans);

        }
        ans += map.get(s.charAt(s.length()-1));;
        return ans;
    }
}
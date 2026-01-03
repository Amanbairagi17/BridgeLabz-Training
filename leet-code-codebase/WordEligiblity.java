//1160. Find Words That Can Be Formed by Characters
class Solution {
    private boolean isPresent(String str, int[] freq){
        int[] curr = new int[26];

        for(char ch : str.toCharArray()) curr[ch-'a']++;

        for(int i = 0; i < 26; i++){
            if(curr[i] > freq[i]) return false;
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        
        int[] freq = new int[26];

        for(char ch : chars.toCharArray()) freq[ch-'a']++;
        int ans = 0;

        for(String word : words){
            if(isPresent(word, freq)){
                ans += word.length();
            }
        }
        return ans;
    }
}
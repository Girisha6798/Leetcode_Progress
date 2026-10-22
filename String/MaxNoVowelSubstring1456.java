class Solution {
    public boolean isVowel(char ch){ // helper function 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                count++; // count vowels in the subarray k
            }
        }
        int maxcount = count;
        for(int i = k ; i < s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                count--; // jo ele subtract ho rha h wo vowel h ? to uska count --
            }

            if(isVowel(s.charAt(i))){
                count++; // jo ele add ho rha h wo vowel h ? to count++;
            }
            maxcount = Math.max(count, maxcount);
        }
        return maxcount;
    }
}
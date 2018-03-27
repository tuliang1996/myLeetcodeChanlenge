class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 1;
        int temp = 1;
        int i;
        int j;
        int m;
        if(s.equals("")) return 0;
        for(i = 0; i < s.length() - 1; i++) {
            temp = 1;
            for(j = i + 1; j < s.length(); j++) {
                for(m = i; m < j; m++) {
                    if(s.charAt(m) == s.charAt(j)) {
                        temp = 1;
                        break;
                    }
                }
                if(m != j) break;
                else {
                    temp++;
                    if(temp > maxLength)
                        maxLength = temp;
                }
            }
        }
        return maxLength;
    }
}
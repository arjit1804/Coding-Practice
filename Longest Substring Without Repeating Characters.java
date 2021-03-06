import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        int i,j,max = 0;
        HashMap<Character, Integer> A = new HashMap<Character, Integer>();
        for(i = 0, j = 0 ;i < s.length();i++)
        {
            if(A.containsKey(s.charAt(i))){
                j = Math.max(j, A.get(s.charAt(i)) + 1);
            }
            A.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
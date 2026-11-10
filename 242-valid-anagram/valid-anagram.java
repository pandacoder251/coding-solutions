import java.util.*;
//bruteforce
/*class Solution {
    public boolean isAnagram(String s, String t) {
       
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray);
    }
}*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
    
        int[] counts = new int[26]; 
        
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        
        for (int score : counts) {
            if (score != 0) {
                return false; 
            }
        }
        
        return true; 
    }
}

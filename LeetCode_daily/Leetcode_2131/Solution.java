package LeetCode_daily.Leetcode_2131;

import java.util.*;

public class Solution {
    public int longestPalindrome(String[] words) {
        int n=0;
 
        HashMap<String,Integer> freq = new HashMap<>();
        for(String word:words)
        {
            String rev = word.charAt(1)+""+word.charAt(0);
            if(freq.getOrDefault(rev,0)>0)
            {
                freq.put(rev,freq.get(rev)-1);
                n+=4;
            }
            else
            {
              freq.put(word,freq.getOrDefault(word,0)+1);
            }
        }    

            for (String word:freq.keySet())
            {
                if (freq.get(word)>0 && word.charAt(0)==word.charAt(1))
                {
                    n+=2;
                    break;
                }
            }
        return n;
        
    }
} {
    
}

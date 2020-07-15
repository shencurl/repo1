package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class 最长不含重复字符串的子字符 {
    public int lengthOfLongestSubstring(String s) {
        int start=0,max=0;
        char[] chars=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<chars.length;i++){
            if (map.containsKey(chars[i])){
                start=Math.max(start,map.get(chars[i])+1);
            }
            map.put(chars[i],i);
            max= Math.max(max,i-start+1);
        }
        return max;
    }
}

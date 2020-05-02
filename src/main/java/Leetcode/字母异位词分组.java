package Leetcode;

import java.security.Key;
import java.util.*;

public class 字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0) return new ArrayList();
        Map<String,List> stringListMap= new HashMap<>();
        for (String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            if (!stringListMap.containsKey(key))stringListMap.put(key,new ArrayList());
            stringListMap.get(key).add(s);
        }
        //调用构造器，values返回所有之前的list
        return new ArrayList(stringListMap.values());
    }
}

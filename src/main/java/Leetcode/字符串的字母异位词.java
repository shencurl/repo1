package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 字符串的字母异位词 {
    public List<Integer> findAnagrams(String s, String p) {
        //滑动窗口中记录的是目前现有的资源，通过不断移动加入和抛弃一部分资源
        //pmap记录p中各个字符的数量，用来和swindow做对比。
        //sWindow记录了滑动窗口中各个字符的数字，随着窗口的滑动而滑动。
        HashMap<Character,Integer> pMap=new HashMap<>();
        HashMap<Character,Integer> sWindow=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for (char c:p.toCharArray()){
            pMap.put(c,pMap.getOrDefault(c,0)+1);
        }
        //初始窗口
        int left=0,right=0;
        //要在窗口中找到s.length个数，并且窗口长度等于p的长度
        int valid=0;
        //开始滑动
        while (right<s.length()){
            char r=s.charAt(right);
            //r如果是p中的值那就要进行处理了，不是就跳过
            if (pMap.containsKey(r)){
                sWindow.put(r,sWindow.getOrDefault(r,0)+1);
                if (sWindow.get(r)<=pMap.get(r))valid++;
            }
            while (valid==p.length()){
                char l=s.charAt(left);
                if (right-left+1==p.length()) res.add(left);
                //移动左窗口时候要考虑左窗口的字符是否是pmap里边的字符，是的话还要进行处理，不是的话就不需要。
                if (pMap.containsKey(l)){
                    //包含的话，滑动窗口的l的值要减1，因为要左移left了
                    sWindow.put(l,sWindow.getOrDefault(l,0)-1);
                    //如果swindow中l的值小于(这是减完以后的，不需要等于，等于说明符合)中的值，说明它不是多余的，valid也要减1；
                    if (pMap.get(l)>sWindow.get(l)) valid--;
                }
                //完成判断后左移
                left++;
            }
            //每次循环移动一次right；
            right++;
        }
        return res;
    }
}

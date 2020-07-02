package Leetcode;

import java.util.Arrays;

public class 把数组排成最小数 {
    /**
     * 比较规则是字符串x,y(按x，y每个字符的ASCLL码逐一比较)如果x+y>y+x则x>y;
     * @param nums
     * @return
     */
    public String minNumber(int[] nums) {
        String[] strs=new String[nums.length];
        for (int i=0;i<nums.length;i++){
            strs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));
        StringBuilder sb=new StringBuilder();
        for (String s:strs)
            sb.append(s);
        return sb.toString();
    }
}

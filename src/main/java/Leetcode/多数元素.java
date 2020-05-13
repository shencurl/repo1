package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class 多数元素 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> result= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (!result.containsKey(nums[i])) result.put(nums[i],1);
            else result.put(nums[i],result.get(nums[i])+1);
        }
        for (Map.Entry<Integer,Integer> entry: result.entrySet()){
            if (entry.getValue()>nums.length/2) return entry.getKey();
        }
        return 0;

    }
}

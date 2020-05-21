package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 所有消失的数字 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            //newIndex表示访问过的数在1-n升序数组中的位置，即这个数对应的index是访问过的，因为这个数可能被标记过成负数，所以要取绝对值。
           int newIndex= Math.abs(nums[i])-1;
           //如果没有标记需要标记为-号
           if (nums[newIndex]>0) nums[newIndex]*=-1;
        }
        for (int i=1;i<=nums.length;i++){
            if (nums[i-1]>0)res.add(i);
        }
        return res;
    }
}

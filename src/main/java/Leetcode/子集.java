package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class 子集 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList());
        for (int i=0;i<nums.length;i++){
            int total=result.size();
            for (int j=0;j<total;j++){
                //一开始结果集为0，取出结果集的每一个List，把num[i]加到每一个List当中，这样就是所有的结果结果集。
                //为什么要new一个ArrayList，因为java是值传递，不new一个相当于还是在result里边的list进行操作。
                List<Integer> tem=new ArrayList<>(result.get(j));
                tem.add(nums[i]);
                result.add(tem);
            }
        }
        return result;
    }
}

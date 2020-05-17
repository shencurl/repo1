package Leetcode;

import java.util.*;

public class 组合总和 {
    /**
     *先排序然后从小到大搜索，为了避免重复，要设置搜索的起点，用了较大的点后只能使用当前点或较小的点。
     * result 是对象可以传递引用过去，而对于基本数据类型在方法里边对其操作不会改变它的值。
     *
     * @param candidates
     * @param target
     * @param
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len=candidates.length;
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(len,0,candidates,target,new ArrayDeque<Integer>(),result);
        return result;
    }
    public void dfs(int len, int begin, int[] candidates, int residue, Deque<Integer> path,List<List<Integer>> result){
        //符合条件的队列
        if (residue==0){
            result.add(new ArrayList<>(path));
        }
        for (int i=begin;i<len;i++){
            if (residue-candidates[i]<0){
                break;
            }
            //path队列加入可能符合的元素，然后递归，递归之后再移除candidate[i],因为后面需要穷举所有path
            path.addLast(candidates[i]);
            dfs(len,i,candidates,residue-candidates[i],path,result);
            path.removeLast();
        }
    }
}

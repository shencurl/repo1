package Leetcode;

import java.util.*;

public class 前k个高频元素 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //存入hashmap
        final HashMap<Integer,Integer> map=new HashMap<>();
        for (int num:nums){
            if (map.containsKey(num))map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        //遍历map，用最小堆保存频率最大的k个元素
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a)-map.get(b);
            }
        });
        for(Integer key:map.keySet()){
            if (pq.size()<k){
                pq.add(key);
            }else if (map.get(key)>map.get(pq.peek())){
                //移除小顶堆顶元素
                pq.remove();
                pq.add(key);
            }
        }
        //取出最小堆的元素
        List<Integer> res=new ArrayList<>();
        while (!pq.isEmpty()){
            res.add(pq.remove());
        }
        return res;
    }
}

package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 课程表 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //记录每个节点的入度
        int[] indegrees=new int[numCourses];
        //创建邻接表
        ArrayList<ArrayList<Integer>> adjacent=new ArrayList<>();
        for (int i=0;i<numCourses;i++){
            adjacent.add(new ArrayList<Integer>());
        }
        //往邻接表和入度数组添加数据,tem[1]为起点进入tem[0]
        for (int[] tem:prerequisites){
            indegrees[tem[0]]++;
            adjacent.get(tem[1]).add(tem[0]);
        }
        //创建一个队列实现广度优先BFS
        Queue<Integer> queue=new LinkedList<>();
        for (int i=0;i<numCourses;i++){
            if (indegrees[i]==0) queue.add(i);
        }
        //离队，看最后numCourses会不会等于0;
        while (!queue.isEmpty()){
            int pre=queue.poll();
            --numCourses;
            //遍历pre为起点的所有元素，把它们的入度减1，如果入度为0，加入队列
            for (int i:adjacent.get(pre)){
                if (--indegrees[i]==0) queue.add(i);
            }
        }
        return numCourses==0;

    }

    //深度优先
    public boolean canFinish1(int numCourses, int[][] prerequisites) {
        int[] flags=new int[numCourses];
        ArrayList<ArrayList<Integer>> adjacent=new ArrayList<>();
        for (int i=0;i<numCourses;i++){
            adjacent.add(new ArrayList<Integer>());
        }
        for (int[] tem:prerequisites){
            adjacent.get(tem[1]).add(tem[0]);
        }
        //所有点都遍历
        for (int i=0;i<numCourses;i++){
            if (!dfs(adjacent,flags,i))return false;
        }
        return true;

    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adjacency, int[] flags, int i){
        if (flags[i]==1) return false;
        //为-1表示以i为起点没有环，直接返回true，不需要再循环
        if (flags[i]==-1) return true;
        flags[i]=1;
        for (int num:adjacency.get(i)){
            //表示有环
            if (!dfs(adjacency,flags,num))return false;
        }
        //全部循环完没有的话吧flag设为-1；
        flags[i]=-1;
        return true;
    }
}

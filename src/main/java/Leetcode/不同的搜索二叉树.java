package Leetcode;

public class 不同的搜索二叉树 {
    public int numTrees(int n) {
        int[] G=new int[n+1];
        //G[n]表示n个结点二叉树的总数量
        G[0]=1;
        G[1]=1;
        //从2开始算起，因为0,1算过了
        for (int i=2;i<=n;i++){
            //G[n]又等于它内部G[1]到G[n-1]的总和
            for (int j=1;j<=i;j++){
                G[i]+=G[j-1]*G[i-j];
            }
        }
        return G[n];
    }

}

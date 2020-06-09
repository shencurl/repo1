package Leetcode;

public class 机器人的运动范围 {
    private int k;
    private int m;
    private int n;
    public int movingCount(int m, int n, int k) {
        boolean[][] isvisted=new boolean[m][n];
        this.k=k;
        this.m=m;
        this.n=n;
        return dfs(0,0,isvisted);
    }
    private int dfs(int x,int y,boolean[][] isvisted){
        if (!isvalid(x,y)||isvisted[x][y])return 0;
        else {
            isvisted[x][y]=true;
            return 1+dfs(x+1,y,isvisted)+dfs(x,y+1,isvisted);
        }
    }
    private boolean isvalid(int x,int y){
        return x>=0&&x<m&&y>=0&&y<n&&(gitSum(x)+gitSum(y)<=k);
    }
    private int gitSum(int x){
        int sum=x%10;
        int tem=x/10;
        while (tem>0){
            sum+=tem%10;
            tem=tem/10;
        }
        return sum;
    }
}

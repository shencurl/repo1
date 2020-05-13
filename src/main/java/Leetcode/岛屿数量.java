package Leetcode;

public class 岛屿数量 {
    private int count=0;
    private int row,column;

    public int numIslands(char[][] grid) {
        if (grid==null||grid.length==0)return 0;
        this.row=grid.length;
        this.column=grid[0].length;
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (grid[i][j]=='1') {
                    ++count;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid,int r, int c){
        if (r<0||c<0||r>=row||c>=column||grid[r][c]=='0')return;
        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
   }

}

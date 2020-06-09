package Leetcode;

public class 矩阵中的路径 {
    private int row;
    private int cloumn;
    //多个回溯方法找一个结果，要全局变量
    private boolean hasfind;
    public boolean exist(char[][] board, String word) {
        this.row=board.length;
        this.cloumn=board[0].length;
        boolean[][] marked=new boolean[row][cloumn];
        for (int i=0;i<row;i++){
            for (int j=0;j<cloumn;j++){
                backtrace(marked,0,word,i,j,board);
                if (hasfind)return true;
            }
        }
        return false;
    }
    private void backtrace(boolean[][] marked,int start,String word,int x,int y,char[][] board){
        if (hasfind)return;
        if (start==word.length()){
            hasfind=true;
            return;
        }
        if (isValid(x,y)&&!marked[x][y]&&board[x][y]==word.charAt(start)) {
                marked[x][y]=true;
                backtrace(marked,start+1,word,x+1,y,board);
                backtrace(marked,start+1,word,x-1,y,board);
                backtrace(marked,start+1,word,x,y+1,board);
                backtrace(marked,start+1,word,x,y-1,board);
                marked[x][y]=false;
        }
    }
    private boolean isValid(int x,int y){
        return x>=0&&x<row&&y>=0&&y<cloumn;
    }
}

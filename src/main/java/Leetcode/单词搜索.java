package Leetcode;

public class 单词搜索 {
    private static int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};
    //hashFind必须要全局变量，visited也是，这样才能知道回溯的结果，row和col因为在好几个方法里边所以也要全局。
    private int row,col;
    private boolean hashfind;
    private boolean[][] visted;
    public boolean exist(char[][] board, String word) {
        row=board.length;
        col=board[0].length;
        hashfind=false;
        //转换为char好操作
        char[] chars=word.toCharArray();
        //字母都不够直接返回
        if (chars.length>row*col)return false;
        visted = new boolean[row][col];
        //首先循环遍历所有字符找到和word第一个字母对应的字母，如果找到了第一个则进入回溯算法，不然则返回false；
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (chars[0]==board[i][j]){
                    backTrack(board,chars,1,i,j);
                    if (hashfind)return true;
                }
            }
        }
        return false;
    }
    //判断是否越界
    private boolean isInArea(int x,int y){
        return x>=0&&x<row&&y>=0&&y<col;
    }
    //回溯
    public void backTrack(char[][] board,char[] word, int curIndex,int x,int y){
        //首先看全局变量，如果是hashfind结束;
        if (hashfind)return;
        //当前如果word已经全部遍历完，返回true;
        if (curIndex==word.length){
            hashfind=true;
            return;
        }
        //把符合条件的点暂时标记为访问了；
        visted[x][y]=true;
        //上下左右一个一个试；
        for (int[] dir:dirs){
            int temX=dir[0]+x,temY=dir[1]+y;
            //要判断是否越界，是否被访问过，还有就是这个点是不是等于word里边要访问的字母
            if (isInArea(temX,temY) && !visted[temX][temY]&&board[temX][temY]==word[curIndex])
                backTrack(board,word,curIndex+1,temX,temY);
        }
        //没找到重新改为false，也就是回溯；
        visted[x][y]=false;


    }
}

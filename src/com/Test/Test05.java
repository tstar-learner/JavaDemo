package com.Test;

public class Test05 {
    public static void main(String[] args) {
        Test05 test05=new Test05();
        char[][] board={{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        boolean res=test05.exist(board,"AAB");
    }
    public boolean exist(char[][] board, String word) {
        int h=board.length;
        int w=board[0].length;
        boolean[][] visited=new boolean[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                boolean flag=check(board,visited,i,j,word,0);
                if(flag==true){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board,boolean[][] visited,int i,int j,String word,int k){
        if(board[i][j]!=word.charAt(k)){
            return false;
        }else if(k==word.length()-1){
            return true;
        }
        visited[i][j]=true;

        int[][] move={{0,1},{0,-1},{1,0},{-1,0}};
        boolean result=false;
        boolean flag=false;
        for(int[] dir:move){
            int newi=i+dir[0];
            int newj=j+dir[1];
            if(newi>=0&&newi<board.length&&newj>=0&&newj<board[0].length){
                if(!visited[newi][newj]){
                    flag=check(board,visited,newi,newj,word,k+1);
                }
                if(flag==true){
                    result=true;
                    break;
                }

            }
        }
        visited[i][j]=false;
        return result;
    }
}

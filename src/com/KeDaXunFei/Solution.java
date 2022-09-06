package com.KeDaXunFei;

public class Solution {
    public static void main(String[] args) {
        Solution.numSpecial(new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}});
    }

    public static int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int flag=0;
        int count=0;
        for(int i=0,j=0;i<m&&j<n;i++,j++){
            for(int k=i;k<m;k++){
                if(mat[k][j]==1){
                    flag++;
                }
            }
            for(int l=j+1;l<n;l++){
                if(mat[i][l]==1){
                    flag++;
                }
            }
            if(flag==1){
                count++;
            }
            flag=0;
        }
        return count;
    }
}

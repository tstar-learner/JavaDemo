package com.practise;

public class Out {
    int i;
    static String s;
    public static class Inner{
    }

    public static void main(String[] args) {
        Out out=new Out();
        System.out.println(out.countPrimes(20));
    }

    public int countPrimes(int n) {
        int i,j;
        int count = 0;
        for (i = 2; i < n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }if (i == j) {
                count++;
            }

        }
        return count;
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int i=0;i<matrix.length-1;i++){
            if(target<=matrix[i][0]&&target>matrix[i+1][0]){
                int left=0;
                int right=matrix[0].length-1;
                int pos=left+(right-left)/2;
                while(left<right){
                    if(matrix[i][pos]==target){
                        return true;
                    }
                    if(target>matrix[i][pos]){
                        left=pos;
                        pos=left+(right-left)/2;
                    }else{
                        right=pos;
                        pos=left+(right-left)/2;
                    }
                }
            }
        }
        return false;
    }
}

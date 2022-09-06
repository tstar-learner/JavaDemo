package com.Test;

import java.util.*;

public class Test04 {
    public static void main(String[] args) throws ClassNotFoundException {
        Object o=new ArrayList<>();
    }

    /**
     * just a test
     * @param m testm
     * @param n testn
     * @param k testk
     * @return
     */
    public static int movingCount(int m, int n, int k) {
        if(k==0){
            return 1;
        }
        Queue<int[]> position=new LinkedList<>();
        boolean[][] flag=new boolean[m][n];
        int[] move_x={0,1};
        int[] move_y={1,0};
        position.offer(new int[]{0,0});
        flag[0][0]=true;
        int ans=1;
        while(!position.isEmpty()){
            int[] cell=position.poll();
            for(int i=0;i<2;i++){
                int tx=move_x[i]+cell[0];
                int ty=move_y[i]+cell[1];
                if(tx<0||tx>=m||ty<0||ty>=n||flag[tx][ty]||get(tx)+get(ty)>k){
                    continue;
                }
                flag[tx][ty]=true;
                position.offer(new int[]{tx,ty});
                ans++;
            }
        }
        return ans;
    }

    public static int get(int num){
        int res=0;
        while(num!=0){
            res+=num%10;
            num/=10;
        }
        return res;
    }


    public static int sum(int n) {
        if (n < 1) {
            return 1;
        }
        return sum(n - 1) * n;

    }
}

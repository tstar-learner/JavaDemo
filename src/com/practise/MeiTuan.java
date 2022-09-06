package com.practise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeiTuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line1=scanner.nextLine();
        String line2=scanner.nextLine();
        List<Integer> tmp1=new ArrayList<>();
        List<Integer> tmp2=new ArrayList<>();
        String[] nt=line1.split(" ");
        String[] n=line2.split(" ");
        int count=1;
        for (int i = 0; i < nt.length; i++) {
            tmp1.add(Integer.parseInt(nt[i]));
        }
        for (int i = 0; i < n.length; i++) {
            tmp2.add(Integer.parseInt(n[i]));
        }
        if (tmp2.get(0)>tmp1.get(1)*tmp1.get(0)){
            System.out.println(0);
            return;
        }

        int tmp=tmp2.get(0);
        if (tmp>tmp1.get(1)) count++;
        for (int i = 1; i < tmp1.get(0); i++) {
            if ((tmp2.get(i)-tmp)/tmp1.get(1)>=1){
                count++;
                tmp=tmp2.get(i);
            }
        }
        System.out.println(tmp1.get(0)-count);
    }


    public static boolean clean(boolean[][] tmp) {
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[0].length; j++) {
                if (tmp[i][j] == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public void test(){
        //        Scanner scanner=new Scanner(System.in);
//        ArrayList<Integer> tmp=new ArrayList<>();
//        int count=0;
//        int[][] move={{0,1},{0,-1},{1,0},{-1,0}};
//        String s1=scanner.nextLine();
//        String[] tmp1=s1.split(" ");
//        for (int i = 0; i < tmp1.length; i++) {
//            tmp.add(Integer.parseInt(tmp1[i]));
//        }
//        String s=scanner.nextLine();
//        int[][] pos=new int[tmp.get(0)][tmp.get(1)];
//        int x=0;
//        int y=0;
//        boolean[][] isClean=new boolean[tmp.get(0)][tmp.get(1)];
//        isClean[0][0]=true;
//        for (int i = 0; i < tmp.get(2); i++) {
//            char c=s.charAt(i);
//            if (c=='W'){
//                x=x-1;
//                isClean[x][y]=true;
//                count++;
//                if(clean(isClean)){
//                    System.out.println("Yes");
//                    System.out.println(count);
//                    break;
//                }
//            }
//            if (c=='A'){
//                y=y-1;
//                isClean[x][y]=true;
//                count++;
//                if(clean(isClean)){
//                    System.out.println("Yes");
//                    System.out.println(count);
//                    break;
//                }
//            }
//            if (c=='S'){
//                x=x+1;
//                isClean[x][y]=true;
//                count++;
//                if(clean(isClean)){
//                    System.out.println("Yes");
//                    System.out.println(count);
//                    break;
//                }
//            }
//            if (c=='D'){
//                y=y+1;
//                isClean[x][y]=true;
//                count++;
//                if(clean(isClean)){
//                    System.out.println("Yes");
//                    System.out.println(count);
//                    break;
//                }
//            }
//        }
//        if (!clean(isClean)){
//            int noCount=0;
//            for (int i = 0; i < isClean.length; i++) {
//                for (int j = 0; j < isClean[0].length; j++) {
//                    if(isClean[i][j]==false)
//                        noCount++;
//                }
//            }
//            System.out.println("No");
//            System.out.println(noCount);
    }
}

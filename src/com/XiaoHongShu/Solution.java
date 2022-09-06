package com.XiaoHongShu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.mirrorNumber());
    }

    public static int mirrorNumber(){
        Scanner scanner=new Scanner(System.in);
        String s="";
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int k=scanner.nextInt();
        List<Integer> nums=new ArrayList<>();
        Stack<Integer> tmp=new Stack<>();
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < nums.size(); j++) {
                tmp.push(nums.get(j));
            }
            while (!tmp.isEmpty()){
                nums.add(tmp.pop());
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            s+=nums.get(i);
        }

        return Integer.parseInt(String.valueOf(s.charAt(k-1)));
    }

//    public static int minOperation(){
//        Scanner scanner=new Scanner(System.in);
//        int min=Integer.MAX_VALUE;
//        int res=0;
//        int count=0;
//        int n=scanner.nextInt();
//        int[] nums=new int[n];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]=scanner.nextInt();
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if(min>Math.abs((Math.abs(nums[i])-7))){
//                min=Math.abs((Math.abs(nums[i])-7));
//                res=i;
//            }
//        }
//        count=Math.abs(Math.abs(nums[res])-7);
//        for (int i = 0; i < nums.length; i++) {
//            if (i!=res){
//                count+=Math.abs(Math.abs(nums[i])-1);
//            }
//        }
//        return count;
//    }

//    public static int minPrice(){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        int k=scanner.nextInt();
//        int min=0;
//        int[] u=new int[m];
//        int[] v=new int[m];
//        int[] w=new int[m];
//        for (int i = 0; i < m; i++) {
//            u[i]=scanner.nextInt();
//        }
//        for (int i = 0; i < m; i++) {
//            v[i]=scanner.nextInt();
//        }
//        for (int i = 0; i < m; i++) {
//            w[i]=scanner.nextInt();
//        }
//
//        for (int i = 0; i < m; i++) {
//            if(v[i]==5&&k>=1){
//                min=w[i];
//            }
//            for (int j = i+1; j < m; j++) {
//                if(u[j]==u[i]&&k>=2&&v[j]==5){
//                    if(min>)
//                }
//            }
//        }
//    }
}

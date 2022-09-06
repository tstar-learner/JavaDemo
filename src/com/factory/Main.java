package com.factory;

import java.util.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Map<Integer,Integer> tmp=new HashMap<>();
        tmp.put(1,1);
        tmp.put(2,2);
        tmp.put(3,3);


    }

    private static void test(Supplier<Fruit> supplier){
        System.out.println(supplier.get()+"被吃掉了");
    }

    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int flag=2*n;
        int i=0;
        int left=0;
        int right=n;
        while(flag>0){
            res[i]=nums[left];
            i++;
            left++;
            flag--;
            res[i]=nums[right];
            right++;
            flag--;
            i++;
        }
        return res;
    }

    public static int lengthOfLongestSubstring(String s) {
        int length=0;
        Set<Character> tmp=new HashSet<>();
        int rk=0;
        for (int i = 0; i < s.length(); i++) {
            if(i!=0){
                tmp.remove(s.charAt(i-1));
            }
            while (rk<s.length()&&!tmp.contains(s.charAt(rk))){
                tmp.add(s.charAt(rk));
                rk++;
            }
            length=Math.max(length,(rk-i+1));
        }
        return length;
    }
}

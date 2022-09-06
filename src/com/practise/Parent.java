package com.practise;

import java.util.TreeSet;

public class Parent {
    public static void main(String[] args) {
        TreeSet<Integer> res=new TreeSet<>();
        int[] nums={1,2,3,4};
        for(int i:nums){
            res.add(i%2!=0?i*2:i);
        }
        int max=res.last()-res.first();
        while(max!=0&&res.last()%2==0){
            res.add(res.last()/2);
            res.remove(res.last());

            max=Math.min(max,res.last()-res.first());
        }
        System.out.println(max);
    }

}

package com.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<String> rec;
    boolean[] vis;

    public static void main(String[] args) {

    }

    public String[] permutation(String s){
        int n= s.length();
        rec=new ArrayList<>();
        vis=new boolean[n];
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        StringBuffer perm=new StringBuffer();
        backtrack(arr,0,n,perm);
        int size=rec.size();
        String[] recArr=new String[size];
        for (int i = 0; i < size; i++) {
            recArr[i]=rec.get(i);
        }
        return recArr;
    }

    private void backtrack(char[] arr, int i, int n, StringBuffer perm) {

    }
}

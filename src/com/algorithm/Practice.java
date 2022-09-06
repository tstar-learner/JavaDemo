package com.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        String s=new String("abc");
        String s1=new String("abc");

        String s2="abc";
        String s3="abc";
        System.out.println(s2==s3);
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
    }

    public double myPow(double x, int n) {
        long N=n;
        return N>0?quickMul(x,N):1.0/quickMul(x,-N);
    }

    public double quickMul(double x,long n){
        if(n==0){
            return 1.0;
        }
        double y=quickMul(x,n/2);
        return n%2==0?y*y:y*y*x;
    }
}

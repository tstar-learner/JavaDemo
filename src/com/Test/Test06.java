package com.Test;

public class Test06 {
    public static void main(String[] args) {
        Test06 test06=new Test06();
        double y=test06.quickMul(0.2,3);
        System.out.println(y);
    }
    public double quickMul(double x,int n){
        if(n==1){
            return x;
        }
        double y=x*quickMul(x,n-1);
        return y;
    }
}

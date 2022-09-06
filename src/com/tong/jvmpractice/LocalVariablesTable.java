package com.tong.jvmpractice;

public class LocalVariablesTable {
    static int b;
    static {
        b=2;
    }
    public static void main(String[] args) {
        int a=0;
        System.out.println();
    }

    public static void print(int a ){
        System.out.println(a);
    }

    public static void print(String s){
        System.out.println(s);
    }
}

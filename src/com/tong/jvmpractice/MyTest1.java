package com.tong.jvmpractice;

public class MyTest1 {
    public static void main(String[] args) {
        int i=30000;
        int j=30000;
        int res=i+j;
        System.out.println(res);
    }
}

class MyParent1 {
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1 {
    public static String str = "welcome";
}

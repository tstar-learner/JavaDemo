package com.tong.jvmpractice;

public class Test2 {
    public static void main(String[] args) {
        Try t = new Try();
        System.out.println(t.a);
    }
}

class Try {
    public static int a;
    public int b;

    public static void main(String[] args) {
        System.out.println(a);
    }
}



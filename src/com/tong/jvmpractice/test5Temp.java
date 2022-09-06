package com.tong.jvmpractice;

public class test5Temp {
    static int num;

    public static void main(String[] args) {
        Son son=new Son();
        son.Out();
    }
}

class Parent{
    public void Out(){
        System.out.println("Parent");
    }
}

class Son extends Parent{
    @Override
    public void Out(){
        //super.Out();
        System.out.println("Son");
    }
}

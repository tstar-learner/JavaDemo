package com.tong.jvmpractice;

public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("hello world");
        try {
            Thread.sleep(1000000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

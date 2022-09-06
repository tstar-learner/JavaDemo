package com.Test;

public class Test07 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

        }
    }
}

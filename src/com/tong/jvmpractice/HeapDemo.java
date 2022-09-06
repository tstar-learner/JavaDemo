package com.tong.jvmpractice;

import java.util.concurrent.*;

public class HeapDemo {
    public static void main(String[] args) {
        CallableTests t1=new CallableTests();
        CallableTests t2=new CallableTests();
        CallableTests t3=new CallableTests();

        ExecutorService ser= Executors.newFixedThreadPool(3);
        Future<String> r1=ser.submit(t1);
        Future<String> r2=ser.submit(t2);
        //Future<String> r3=ser.submit(t3);

    }
}

class CallableTests implements Callable<String> {
    @Override
    public String call() throws Exception {
        String b="true";
        Thread.sleep(1000000);
        return b;
    }
}

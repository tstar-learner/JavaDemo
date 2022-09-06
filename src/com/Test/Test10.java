package com.Test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Test10 test=new Test10();
        System.out.println(test.findNthDigit(10000));
    }

    public int findNthDigit(int n) {
        if(n<=9){
            return n;
        }
        int digit=1;
        int count=9;
        int start=1;
        while(n>digit*count){
            n-=digit*count;
            digit++;
            count*=10;
            start*=10;

        }
        long num=start+(n-1)/digit;
        return Long.toString(num).charAt((n-1)%digit)-'0';
    }

}

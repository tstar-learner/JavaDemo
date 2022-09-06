package com.practise;

import java.util.*;

public class SuperTest extends Date {
    private static final long serialVersionUID = 1l;

    private void test() {
        System.out.println(super.getClass().getName());
    }

    public static void main(String[] args) {
        TreeSet<Integer> res=new TreeSet<>();
        res.add(2);
        res.add(23);
        res.add(4);
        res.add(6);
        res.add(1);
        res.add(9);
        System.out.println(res);
    }

}
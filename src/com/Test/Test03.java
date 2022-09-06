package com.Test;

import java.util.TreeSet;

public class Test03 {
    public static void main(String[] args) {

    }
}

class MyCalendar {
    TreeSet<int[]> res;

    public MyCalendar() {
        res = new TreeSet<>((a, b) -> a[0] - b[0]);
    }

    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        boolean flag = myCalendar.book(1, 2);
        System.out.println(flag);
    }

    public boolean book(int start, int end) {
        if (res==null) {
            res.add(new int[]{start, end});
            return true;
        }
        int[] tmp = {end, 0};
        int[] arr = res.ceiling(tmp);
        int[] prev = arr == null ? res.last() : res.lower(arr);
        if (arr == res.first() || res.lower(tmp)[1] <= start) {
            res.add(new int[]{start, end});
            return true;
        }
        return false;
    }
}


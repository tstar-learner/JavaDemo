package com.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class B {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        String date1=scanner.next();
        String date2=scanner.next();
        SimpleDateFormat sdf=new SimpleDateFormat("mm-dd");
        Date d1=sdf.parse(date1);
        Date d2=sdf.parse(date2);
        System.out.println((d2.getTime()-d1.getTime())/(60*60*24*1000));
    }

    public static int single(int num){
        int res=0;
        String s=Integer.toString(num);
        while (s.length()>1){
            res=0;
            for (int i = 0; i < s.length(); i++) {
                res+=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            s=Integer.toString(res);
        }
        return res;
    }

    public static int find(int[] arr){
        int res=0;
        Map<Integer,Integer> tmp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (tmp.containsKey(arr[i])){
                tmp.put(arr[i],tmp.get(arr[i])+1);
            }else {
                tmp.put(arr[i],1);
            }
        }
        for (int key :
                tmp.keySet()) {
            if (tmp.get(key)>arr.length/2){
                res=key;
            }
        }
        return res;
    }
}

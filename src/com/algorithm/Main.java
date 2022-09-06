package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        
        List<String> tmp=new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String name=scanner.next();
            tmp.add(name);
        }
        int res=judge(tmp);
        System.out.println(res);
    }

    public static int judge(List<String> tmp){
        int count=0;
        String regex="^[a-zA-Z]+$";
        for (String s :
                tmp) {
            if (s.matches(regex)&&s.length()<=10){
                count++;
            }
        }
        return count;
    }
}

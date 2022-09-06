package com.Test;

import java.util.Scanner;

public class Main360 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] ui=new int[m];
        int[] vi=new int[m];
        int[] wi=new int[m];
        int[] min=new int[n];
        int min_tmp=Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            ui[i]=scanner.nextInt();
            vi[i]=scanner.nextInt();
            wi[i]=scanner.nextInt();
        }
        for (int i = 0; i < ui.length; i++) {
            if(ui[i]==1&&min_tmp>wi[i]){
                min[1]=wi[i];
            }
        }
        for (int i :
             wi) {
            System.out.println(i);
        }
    }
}

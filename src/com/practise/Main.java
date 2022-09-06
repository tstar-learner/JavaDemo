package com.practise;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//class Solution {
//
//    /* Write Code Here */
//    public int findMinDifference(String[] timePoints) {
//        int res=Integer.MAX_VALUE;
//        for (int i = 0; i < timePoints.length; i++) {
//            for (int j = i+1; j < timePoints.length; j++) {
//                String[] tmpi=timePoints[i].split(":");
//                String[] tmpj=timePoints[j].split(":");
//                int mins_i=Integer.parseInt(tmpi[0])*60+Integer.parseInt(tmpi[1]);
//                int mins_j=Integer.parseInt(tmpj[0])*60+Integer.parseInt(tmpj[1]);
//                if (mins_i==0) mins_i=1440;
//                if(mins_j==0) mins_j=1440;
//                int min=Math.abs(mins_i-mins_j);
//                if (res>min){
//                    res=min;
//                }
//
//            }
//        }
//        return res;
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int res;
//
//        int timePoints_size = 0;
//        timePoints_size = in.nextInt();
//        if (in.hasNextLine())
//            in.nextLine();
//        String[] timePoints = new String[timePoints_size];
//        String timePoints_item;
//        for(int timePoints_i = 0; timePoints_i < timePoints_size; timePoints_i++) {
//            try {
//                timePoints_item = in.nextLine();
//            } catch (Exception e) {
//                timePoints_item = null;
//            }
//            timePoints[timePoints_i] = timePoints_item;
//        }
//
//        res = new Solution().findMinDifference(timePoints);
//        System.out.println(String.valueOf(res));
//
//    }
//}

class Solution {

    /* Write Code Here */
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> res=new TreeSet<>();


        return 1;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int nums_size = 0;
        nums_size = in.nextInt();
        int[] nums = new int[nums_size];
        for(int nums_i = 0; nums_i < nums_size; nums_i++) {
            nums[nums_i] = in.nextInt();
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = new Solution().minimumDeviation(nums);
        System.out.println(String.valueOf(res));

    }
}


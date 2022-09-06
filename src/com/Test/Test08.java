package com.Test;

import java.util.ArrayList;
import java.util.List;

public class Test08 {
    public static void main(String[] args) {
        Test08 test=new Test08();
        System.out.println(test.findClosestElements(new int[]{1, 2, 3, 4}, 4, 3));
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int right = binary(arr, x);
        int left = right - 1;
        for (int i = 0; i < k; i++) {
            if (left < 0) {
                right++;
            } else if (right >= arr.length-1) {
                left--;
            }
            if ((x - arr[left]) > (arr[right] - x)) {
                right++;
            } else {
                left--;
            }
        }
        for (int i = left + 1; i < right; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    public int binary(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}


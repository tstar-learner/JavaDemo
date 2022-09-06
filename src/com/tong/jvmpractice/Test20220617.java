package com.tong.jvmpractice;

import java.util.Arrays;

/**
 * <p>主要是用于测试一下javadoc</p>
 * @author TONG
 */
public class Test20220617 {
    public static void main(String[] args) {
        String a="12345";
    }

    /**
     * 用来测试一下
     * @param arr
     */
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int a = 0;
        for (int i = 0; i < arr.length && a < arr.length; i++) {
            if (arr[i] == 0) {
                temp[a++] = arr[i];
                temp[a] = 0;
            }else {
                temp[a++] = arr[i];
            }
        }
        arr = Arrays.copyOf(temp, temp.length);
    }
}


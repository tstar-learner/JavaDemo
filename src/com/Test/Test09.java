package com.Test;

import java.util.*;

public abstract class Test09 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int nums1_length=scanner.nextInt();
        int nums2_length=scanner.nextInt();
        int[] nums1=new int[nums1_length];
        int[] nums2=new int[nums2_length];
        for (int i = 0; i < nums1_length; i++) {
            nums1[i]=scanner.nextInt();
        }
        for (int i = 0; i < nums2_length; i++) {
            nums2[i]=scanner.nextInt();
        }
        Test09.nextGreaterElement(nums1,nums2);

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> tmp=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            tmp.put(nums2[i],i);
        }

        for(int i=0;i<nums1.length;i++){
            if(tmp.containsKey(nums1[i])){
                if(tmp.get(nums1[i])==nums2.length-1){
                    res.add(-1);
                }
                for(int j=tmp.get(nums1[i]);j<nums2.length;j++){
                    if(j==nums2.length-1){
                        res.add(-1);
                        break;
                    }
                    if(nums2[j+1]>nums1[i]){
                        res.add(nums2[j+1]);
                        break;
                    }
                }
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static String[] methodString(){
        Set<String> res=new HashSet<>();
        res.add("acv");
        res.add("asdf");
        res.add("dsfdsf");
        String[] array=new String[res.size()];
        return res.toArray(array);
    }

    public void methodA(){
        System.out.println("A");
    }

    public void methodB(){
        System.out.println("B");
    }

    public abstract void methodC();
}

class Test extends Test09{

    @Override
    public void methodC() {
        System.out.println("SubC");
        methodB();
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.methodA();
        test.methodB();
        test.methodC();

        }
}

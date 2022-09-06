package com.practise;

import java.lang.ref.SoftReference;
import java.util.*;

public class Test {
    private Test(){

    }

    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashTable=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashTable.containsKey(target-nums[i])){
                return new int[]{hashTable.get(target-nums[i]),i};
            }
            hashTable.put(nums[i],i);
        }
        return new int[0];
    }

    public List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[j].contains(words[i])&&words[i].length()<words[j].length()){
                    res.add(words[i]);
                }
            }
        }
        return res;
    }
}

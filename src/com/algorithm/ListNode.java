package com.algorithm;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode GenerateListNode(int[] nums) {
        ListNode ln=new ListNode(nums[0]);
        ListNode temp=ln;
        for (int i = 1; i < nums.length; i++) {
            temp.next=new ListNode(nums[i]);
            temp=temp.next;
        }
        return ln;
    }

}

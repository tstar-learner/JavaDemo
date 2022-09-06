package com.practise;

import java.util.Stack;

public class Hello {
    public static void main(String[] args) {
        Hello h = new Hello();
//        ListNode tmp = h.arrayToListNode(new int[]{1, 3, 2});
//        int[] res = h.reversePrint(tmp);
//        for (int i :
//                res) {
//            System.out.println(i);
//        }
        //Hello h1=null;
        h.say();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode arrayToListNode(int[] arr) {
        ListNode res = new ListNode(arr[0]);
        ListNode head = res;
        for (int i = 1; i < arr.length; i++) {
            head.next = new ListNode(arr[i]);
            head = head.next;
        }
        return res;
    }

    public int[] reversePrint(ListNode head) {
        if (head == null) return null;
        Stack<Integer> tmp = new Stack<>();
        do {
            tmp.push(head.val);
            head = head.next;
        } while (head != null);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.pop();
        }
        return res;
    }

    public static void say(){
        System.out.println("say");
    }
}

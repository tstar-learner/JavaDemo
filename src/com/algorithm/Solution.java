package com.algorithm;

import org.w3c.dom.ls.LSException;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] temp={{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        System.out.println(temp.length+" "+temp[0].length);

    }

    /**
     * 15：二进制中1的个数
     */
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }

    public int hammingWeight01(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    /**
     * 17：打印从1到最大的n位数
     */
    public static int[] printNumbers(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < Math.pow(10, n) - 1; i++) {
            res.add(i);
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

    /**
     * 18: 删除链表的节点
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }

    /**
     * 21:调整数组顺序使奇数位于偶数前面
     */
    public static int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int temp = 0;
        while (i < j) {
            if (nums[i] % 2 == 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            } else if (nums[i] % 2 != 0) {
                i++;
            }
        }
        return nums;
    }

    /**
     * 22:链表中倒数第K个节点
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode cur = head;
        for (int i = 0; i < k - 1; i++) {
            cur = cur.next;
        }
        while (cur.next != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return pre;
    }

    /**
     * 24:反转链表
     */
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 25：合并两个排序的链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prevhead = new ListNode(-1);
        ListNode prev = prevhead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prevhead.next;
    }

    /**
     * 27:二叉树的镜像
     */
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    /**
     * 29:顺时针打印矩阵
     */
    public static int[] spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int[] result = new int[total];
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int row = 0, column = 0;
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            result[i] = matrix[row][column];
            visited[row][column] = true;
            int nextRow = row + direction[directionIndex][0];
            int nextColumn = column + direction[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn] == true) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += direction[directionIndex][0];
            column += direction[directionIndex][1];
        }
        return result;
    }

    /**
     * 32：从上到下打印二叉树II
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                result.add(temp);
            }
        }
        return result;
    }

    /**
     * 39:数组中出现次数超过一半的数字
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int item :
                nums) {
            if (temp.containsKey(item)) {
                temp.put(item, temp.get(item) + 1);
            } else {
                temp.put(item, 1);
            }
        }
        for (Map.Entry<Integer, Integer> item :
                temp.entrySet()) {
            if (item.getValue() > nums.length / 2)
                return item.getKey();
        }
        return 0;
    }

    /**
     * 40：最小的k个数
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        /**排序
         List<Integer> result=new ArrayList<>();
         List<Integer> temp=new LinkedList<>();
         for (int a :
         arr) {
         temp.add(a);
         }
         Collections.sort(temp);
         for (int i = 0; i < k; i++) {
         result.add(temp.remove(0));
         }
         return result.stream().mapToInt(Integer::intValue).toArray();
         */
        int[] vec = new int[k];
        if (k == 0) {
            return vec;
        }
        Queue<Integer> result = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < k; i++) {
            result.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (result.peek() > arr[i]) {
                result.poll();
                result.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            vec[i] = result.poll();
        }
        return vec;
    }

    /**
     * 50:第一个只出现一次的字符
     */
    public char firstUniqChar(String s) {
        Map<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (temp.containsKey(s.charAt(i))) {
                temp.put(s.charAt(i), -1);
            } else {
                temp.put(s.charAt(i), i);
            }
        }
        int first = s.length();
        for (Map.Entry<Character, Integer> entry :
                temp.entrySet()) {
            int pos = entry.getValue();
            if (pos != -1 && pos < first) {
                first = pos;
            }
        }
        return first == s.length() ? ' ' : s.charAt(first);
    }

    /**
     * 52：两个链表的第一个公共节点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * 875:爱吃香蕉的珂珂
     */
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int maxSpeed = piles[piles.length - 1];
        int minSpeed = 1;
        int spendHours;
        int k = maxSpeed;
        while (minSpeed < maxSpeed) {
            spendHours = 0;
            int speed = (maxSpeed - minSpeed) / 2 + minSpeed;
            for (int i = 0; i < piles.length; i++) {
                spendHours += (piles[i] + speed - 1) / speed;
            }
            if (spendHours <= h) {
                k = speed;
                maxSpeed = speed;
            } else {
                minSpeed = speed + 1;
            }
        }
        return k;
    }

    /**
     * 53：在排序的数组中查找数字 I
     */
    public int search(int[] nums, int target) {
        /* 利用HashSet
        int count=0;
        Set<Integer> temp=new HashSet<>();
        temp.add(target);
        for (int i :
                nums) {
            if (temp.contains(i)){
                count++;
            }
        }
        return count;
         */

        //利用二分查找法
        int leftId = 0;
        int rightId = nums.length - 1;
        int mid = (rightId - leftId) / 2 + leftId;
        while (leftId < rightId) {
            if (nums[mid] < target) {
                leftId = mid + 1;
            } else if (nums[mid] > target) {
                rightId = mid - 1;
            }
        }
        return 0;
    }

    /**
     * 62：圆圈中最后剩下的数字
     */
//    public int lastRemaining(int n,int m){
//
//    }

    /**
     * 53-II: 0~n-1中缺失的数字
     */
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return result;
    }

    /**
     * 54:二叉搜索树的第K大节点
     */
//    public int kthLargest(TreeNode root, int k) {
//        if (root==null){
//            return 0;
//        }
//    }

    /**
     * 1089
     */
    public void duplicateZeros(int[] arr){
        Stack<Integer> temp=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                temp.push(0);
                temp.push(0);
            }
            else{
                temp.push(arr[i]);
            }
        }
        for (int i = arr.length-1; i >=0; i--) {
            arr[i]=temp.pop();
        }
    }

    /**
     * 1108
     */
    public String defangIPaddr(String address) {
        String result="";
        List<Character> queue=new ArrayList<>();
        char[] ac=address.toCharArray();
        for(char c:ac){
            if (c!='.'){
                queue.add(c);

            }else{
                queue.add('[');
                queue.add('.');
                queue.add(']');
            }
        }
        for(int i=0;i<queue.size();i++){
            result += queue.get(i);
        }
        return result;
    }

    /**
     * 64
     */
    public int sumNums(int n){
        int sum=0;
        if (n==0){
            return 0;
        }else{
            sum+=sumNums(n);
        }
        return sum+n;
    }

    class MinStack {
        List<Integer> list = new ArrayList<>();

        public MinStack() {

        }

        public void push(int x) {
            list.add(x);
        }

        public void pop() {
            list.remove(list.size() - 1);
        }

        public int top() {
            return list.get(list.size() - 1);
        }

        public int min() {
            int min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (min > list.get(i)) {
                    min = list.get(i);
                }
            }
            return min;
        }
    }
}

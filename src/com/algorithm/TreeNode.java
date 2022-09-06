package com.algorithm;

import java.util.*;

public class TreeNode {
    static List<Integer> tmp=new ArrayList<>();
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int x){
        val=x;
    }
    static int counter=0;

    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }

        // 前序遍历中的第一个节点就是根节点
        int preorder_root = preorder_left;
        // 在中序遍历中定位根节点
        int inorder_root = indexMap.get(preorder[preorder_root]);

        // 先把根节点建立出来
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // 得到左子树中的节点数目
        int size_left_subtree = inorder_root - inorder_left;
        // 递归地构造左子树，并连接到根节点
        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // 递归地构造右子树，并连接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode();
        TreeNode mirror=new TreeNode();
        int[] preorder={4,2,1,3,7,6,9};
        int[] inorder={1,2,3,4,6,7,9};
        TreeNode treeNode=new TreeNode();
        root=treeNode.buildTree(preorder,inorder);
        mirror=TreeNode.mirrorTree(root);
        int[] res= TreeNode2Array(root);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static TreeNode mirrorTree(TreeNode root){
        if (root == null) {
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static int[] TreeNode2Array(TreeNode tree){
        if(tree!=null){
            tmp.add(tree.val);
        }
        if(tree.left!=null){
            TreeNode2Array(tree.left);
        }
        if(tree.right!=null){
            TreeNode2Array(tree.right);
        }
        return tmp.stream().mapToInt(Integer::intValue).toArray();
    }
}

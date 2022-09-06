package com.Test;

import java.util.Stack;

public class Mainkunlun {
    public static void main(String[] args) {
        Mainkunlun mainkunlun=new Mainkunlun();
        System.out.println(mainkunlun.longestValidParentheses("()())()"));
    }

    public int longestValidParentheses (String s) {
        // write code here
        int count=0;
        Stack<Character> tmp=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                tmp.push('(');
            }
            while(i<s.length()&&s.charAt(i)==')'&&tmp.size()!=0){
                tmp.pop();
                count++;
                i++;
            }
        }
        return count*2;
    }
}

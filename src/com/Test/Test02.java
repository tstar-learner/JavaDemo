package com.Test;

import java.util.*;

public class Test02 {
    private Map<Integer,String> code=new HashMap<Integer,String>();
    private int id;
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int d=(int)1e7;
        System.out.println(d);

    }

    public static int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String encode(String longUrl) {
        id++;
        code.put(id,longUrl);
        return "http://tinyurl.com/"+id;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int p=shortUrl.lastIndexOf('/')+1;
        int key=Integer.parseInt(shortUrl.substring(p));
        return code.get(key);
    }

    public static String reverseWords(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r && s.charAt(l) == ' ') {
            l++;
        }
        while (l < r && s.charAt(r) == ' ') {
            r--;
        }
        StringBuilder sb = new StringBuilder();
        Deque<String> res = new ArrayDeque<>();
        while (l <= r) {
            char c = s.charAt(l);
            if (sb.length() != 0 && c == ' ') {
                res.offerFirst(sb.toString());
                sb.setLength(0);
            }
            sb.append(c);
            l++;
        }
        res.offerFirst(sb.toString());
        return String.join(" ", res);
    }
}

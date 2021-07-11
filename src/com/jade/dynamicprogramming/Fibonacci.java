package com.jade.dynamicprogramming;

import java.util.HashMap;

public class Fibonacci {

    HashMap<Integer, Integer> memo = new HashMap<>();

    public int getFib(int i) {
       if (i < 0) {
           throw new IllegalArgumentException("Negative index");
       }
       if (i == 0 || i == 1) {
           return 1;
       }
       if (memo.containsKey(i)) {
           return memo.get(i);
       }

       int result = getFib(i - 1) + getFib(i - 2);
       memo.put(i, result);

       return result;
    }
}

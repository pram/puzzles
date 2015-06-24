package com.naughtyzombie.missingelement;// you can also use imports, for example:
// import java.util.*;

import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int maxTotal = ((n + 1) * (n + 2)) / 2;
        int totalA = Arrays.stream(A).reduce(0, Integer::sum);

        return maxTotal - totalA;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();


        System.out.println(sol.solution(new int[] {2,3,1,5}));
    }
}
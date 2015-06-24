package com.naughtyzombie.timecomplexity2;// you can also use imports, for example:
// import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int retVal = Arrays.stream(A).boxed().collect(Collectors.toList()).stream().reduce(Integer::max).get();
        for (int i=1; i < n; i++) {
            int[] firstHalf = Arrays.copyOfRange(A, 0, i);
            int firstHalfSum = Arrays.stream(firstHalf).boxed().collect(Collectors.toList()).stream().reduce(Integer::max).get();
            int[] secondHalf = Arrays.copyOfRange(A, i, n);
            int secondHalfSum = Arrays.stream(secondHalf).boxed().collect(Collectors.toList()).stream().reduce(Integer::max).get();
            
            int diff = Math.abs(firstHalfSum - secondHalfSum);
            
            if (diff < retVal) {
                retVal = diff;
            }
        }
        
        return retVal;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{3,1,2,4,3}));
    }
}
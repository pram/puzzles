package com.naughtyzombie.uniqueelements;// you can also use imports, for example:
// import java.util.*;
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Set<Integer> vals = new HashSet<>(A.length);
        for (int i : A) {
            vals.add(i);
        }
        
        return vals.size();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] input = {2,1,1,3,1,1};
        System.out.println(sol.solution(input));
    }
}
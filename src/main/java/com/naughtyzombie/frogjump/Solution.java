package com.naughtyzombie.frogjump;

class Solution {
    public int solution(int X, int Y, int D) {
        int i = Y - X;
        int minJump = i/D;
        int adjust = i % D > 0 ? 1 : 0;
        return minJump + adjust;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10, 85, 30));
    }
}
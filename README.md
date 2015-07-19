# Programming Puzzles

[![Build Status](https://travis-ci.org/pram/puzzles.svg?branch=master)](https://travis-ci.org/pram/puzzles)

General Puzzles and examples from "Cracking the Coding Interview".

## FizzBuzz

Print the numbers from 1 to 100. If the number is divisible by 3 then print "Fizz", if the number is divisible by 5 then print "Buzz" and if the number is divisible by both 3 and 5 then print "FizzBuzz"

## ReverseCount

Print 100 to 1

[Ref](http://www.thousandtyone.com/blog/EasierThanFizzBuzzWhyCantProgrammersPrint100To1.aspx)

## OCP

Puzzles from Java 6 310-065 exam

## Fibonacci

Fibonacci problem

## Time Complexity

Problem: You are given an integer *n*. Count the total of 1 + 2 + . . . + *n*

## Number counting

Problem: You are given an integer m (1 ¬ m ¬ 1 000 000) and two non-empty, zero-indexed arrays A and B of n integers, a0, a1, . . . , an?1 and b0, b1, . . . , bn?1 respectively (0 ¬ ai , bi ¬ m). The goal is to check whether there is a swap operation which can be performed on these arrays in such a way that the sum of elements in array A equals the sum of elements in array B after the swap. By swap operation we mean picking one element from array A and one element from array B and exchanging them


## Time Complexity2

A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P ? 1] and A[P], A[P + 1], ..., A[N ? 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P ? 1]) ? (A[P] + A[P + 1] + ... + A[N ? 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
  
We can split this tape in four places:

P = 1, difference = |3 ? 10| = 7 
P = 2, difference = |4 ? 9| = 5 
P = 3, difference = |6 ? 7| = 1 
P = 4, difference = |10 ? 3| = 7 
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

Assume that:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [?1,000..1,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

## Missing Element

A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

int solution(int A[], int N);

that, given a zero-indexed array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Assume that:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

## Frog Jump

A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

int solution(int X, int Y, int D);

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Assume that:

X, Y and D are integers within the range [1..1,000,000,000];
X ? Y.
Complexity:

expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).

## Unique Elements

Write a function

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers, returns the number of distinct values in array A.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [?1,000,000..1,000,000].
For example, given array A consisting of six elements such that:

A[0] = 2    A[1] = 1    A[2] = 1
A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

## Shiftarray

Given an array of items, for example

    int[] in = {1,2,3,4,5,6,7,8,9}

Write a function to shift the array from a prespecified location in the array. Eg shift 3 will end up with the output

    int[] out = {4,5,6,7,8,9,1,2,3}
    
## Rotate Matrix

Given an N*N Matrix, rotate the matrix by 90 degrees. So for a Matrix

    * * * ^ * * *
    * * * | * * *
    * * * | * * *
    * * * | * * *
    
We want to transform it into

    * * * *
    * * * *
    * * * *
    -- - - >
    * * * *
    * * * *
    * * * *
    
Essentially the transformation boils down to the following

    first row of source ------> last column of destination
    second row of source ------> last but-one column of destination
    so ... on
    last row of source ------> first column of destination

## Palindrome Test

Given a string of a write a check to see if it is a palindrome

## Suffix Prefix Test

Given a string of a certain length find a method to return the length of the longest common suffix and prefix of that string.  
The prefix can consist of the entire string except the last letter.  
The suffix can consist of the entire string except the first letter.

For example for the string "abbabba", the longest possible prefix is "abbabb" and the longest possible suffix is "bbabba".  
The longest common prefix and suffix is "bbabb" which means that the method should return 5.

If no common string exists then -1 should be returned.

# Todo

## find the angle between the hour and minute hand on a analogue clock for any given time.
## reverse a string

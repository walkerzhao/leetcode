# 题目
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

## tags: Divide and Conquer, Array, Bit Manipulation

## 思路
* 题目意思：给出一个数组，求出个数大于n/2的那个数
* 自己当时只想了一个暴力的，挨个比较
* 可以先排序，然后比较
* 这里采用的投票算法，假定第一个数是大数，开始，相同+1,不同-1，如果==0，表示这部分里不是大数，清０．重新开始计票。
# 问题
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?

## tags:array

## 思路
* 题目要求用o(k)的空间来存储结果
* 使用递归的思想，保存数组中当前数组的元素（防止覆盖掉）
　

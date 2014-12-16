# 题目
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

## tag:stack string

## 思路
* 括号的匹配问题,使用stack来存储字符串
* 如果是左括号就入栈；如果是右括号，就查看栈顶元素，匹配的话，就弹出元素，否则返回错误
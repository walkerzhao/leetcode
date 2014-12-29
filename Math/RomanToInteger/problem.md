# 题目
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

## Tag:Math,String

## 解题思路
* 首先需要去了解罗马数字的规则，共有７种字符：I/V/X/L/C/D/M,表示1,5,10,50,100,500,1000. 最低位如果大于次低位的话，就做减法，否则做加法，以此循环

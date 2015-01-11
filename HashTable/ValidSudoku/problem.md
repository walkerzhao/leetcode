# 题目
Determine if a Sudoku is valid, according to: [Sudoku Puzzles - The Rules.](http://blog.csdn.net/zy416548283)

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

## tags:Hash Table

## 题目解读:
* 用标志位判断每一行每一列每个九宫格是否有重复字符即可
* 给定的数据二维数组时字符,而不是数字,空的地方用字符'.'来代替
* 注意循环的效率
import string
class Solution:
    # @param board, a 9x9 2D array
    # @return a boolean
    def isValidSudoku(self, board):
        for i in range(9):
            rowList = ['0' for k in range(10)]
            columnList = ['0' for k in range(10)]
            subBoardList = ['0' for k in range(10)]
            for j in range(9):

                if not self.checkValid(rowList,board[i][j]):
                    return False
                if not self.checkValid(columnList, board[j][i]):
                    return False
                if not self.checkValid(subBoardList, board[3*(i/3)+j/3][3*(i%3)+j%3]):
                    return False
        return True

    def checkValid(self, list, value):
       # print value
        if value == '.':
            return True
        else:
            value = string.atoi(value)
            #print value
        if list[value] == '1':
            return False
        list[value] = '1'
        return True



if __name__ == "__main__":
    test = Solution()
    board = [ ['5','3','.','.','7','.','.','.','.'],
              ['6','.','.','1','9','5','.','.','.'],
              ['.','9','8','.','.','.','.','6','.'],
              ['8','.','.','.','6','.','.','.','3'],
              ['4','.','.','8','.','3','.','.','1'],
              ['7','.','.','.','2','.','.','.','6'],
              ['.','6','.','.','.','.','2','8','.'],
              ['.','.','.','4','1','9','.','.','5'],
              ['.','.','.','.','8','.','.','7','9']
            ]

    print test.isValidSudoku(board)


        

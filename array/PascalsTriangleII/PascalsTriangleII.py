__author__ = 'zy'

class Solution:
    # @return a list of integers
    def getRow(self, rowIndex):
        list = [1]
        for i in range(1, rowIndex+1):
            temp = 1
            for j in range(1, i):
                last_number = temp
                temp = list[j]
                list[j] = list[j] + last_number
            list.append(1)
        return list




if __name__ == '__main__':
    test = Solution()
    print test.getRow(3)
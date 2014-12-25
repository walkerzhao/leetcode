# --*coding:utf-8 --
#使用归并排序的方法
__author__ = 'zy'


class Solution:
    # @param A  a list of integers
    # @param m  an integer, length of A
    # @param B  a list of integers
    # @param n  an integer, length of B
    # @return nothing
    def __init__(self):
        pass

    def merge(self, A, m, B, n):
        temp = [0 for i in range(m+n)]
        i=0; j=0; k=0;
        while i < m and j < n:
            if A[i] <= B[j]:
                temp[k] = A[i]
                k += 1
                i += 1
            else:
                temp[k] = B[j]
                k += 1
                j += 1
        if i == m:
            while j < n:
                temp[k] = B[j]
                j += 1
                k += 1
        else:
            while i < m:
                temp[k] = A[i]
                k += 1
                i += 1
        for i in range(0, m+n):
            A[i] = temp[i]
            print A[i]

if __name__ == "__main__":
    test = Solution()
    m = 4
    n = 4
    A = [0 for i in range(m+n)]
    temp = [1, 3, 4, 6]
    for i in range(0, m):
        A[i]= temp[i]
    B = [2, 5, 7, 8]

    test.merge(A, m, B, n)


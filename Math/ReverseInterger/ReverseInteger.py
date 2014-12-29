# -*- coding:utf-8 -*-
__author__ = 'zy'
import sys

class Solution:
    # @return an integer
    def reverse(self, x):

        sign = 1 if x > 0 else -1
        x = abs(x)
        result = 0
        while x > 0:
            result = result*10 + x % 10
            x /= 10
        result = sign*result
        if result > 2147483647 or result < -2147483648:
            return 0
        return result


if __name__ == "__main__":
    test = Solution()
    print test.reverse(-123)
2147483647
#test
#0
#溢出:1534236469
#-123
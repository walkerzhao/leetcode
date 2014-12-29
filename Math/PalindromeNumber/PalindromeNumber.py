__author__ = 'zy'


class Solution:
    # @return a boolean
    def isPalindrome(self, x):
        if x < 0:
            return False
        result = 0
        original = x
        while x > 0:
            result = result*10 + x % 10
            x /= 10
        if result == original:
            return True
        else:
            return False

if __name__ == "__main__":
    test = Solution()
    print test.isPalindrome(5)

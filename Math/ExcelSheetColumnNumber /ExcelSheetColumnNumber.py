__author__ = 'zy'


class Solution:
    # @param s, a string
    # @return an integer
    def titleToNumber(self, s):
        result = 0
        for i in range(len(s)):
            temp = ord(s[i]) - ord('A') + 1
            result = result * 26 + temp

        return result

if __name__ == "__main__":
    test = Solution()
    print test.titleToNumber("AA")


#test:
# AA

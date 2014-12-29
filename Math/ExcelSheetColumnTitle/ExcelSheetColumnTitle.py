__author__ = 'zy'


class Solution:
    # @return a string
    # def convertToTitle(self, num):
    #     result=""
    #     while num > 26:
    #         yushu = num % 26
    #         if yushu == 0:
    #             num = num/26 - 1
    #             result += 'Z'
    #         else:
    #             num = num/26
    #             result += chr(yushu-1 + ord('A'))
    #     result += chr(num-1 + ord('A'))
    #
    #     return result[::-1]

    def convertToTitle(self, num):
        result=""
        while num > 0:
            yushu = (num-1) % 26
            result += chr(yushu + ord('A'))
            num = (num-1)/26

        return result[::-1]


if __name__ == "__main__":
    test= Solution()
    print test.convertToTitle(52)

#test
#26
#27
#52
#53
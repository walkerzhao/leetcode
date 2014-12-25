__author__ = 'zy'


class Solution:
    # @param num, a list of integers
    # @return an integer
    def majorityElement(self, num):
        most = num[0]
        count = 1
        for item in num[1:]:
            if item == most:
                count += 1
            else:
                if count == 0:
                    most = item
                    count = 1
                else:
                    count -= 1
        return most

if __name__ == "__main__":
    num = [6,5,5]
    test = Solution()
    print test.majorityElement(num)


#Test
#[1,2,3,4,5,2,2,5,2]
#[6,5,5]
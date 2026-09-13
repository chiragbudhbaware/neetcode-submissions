class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        if not nums:
            return 0

        n = len(nums)
        j = 0

        for i in range(0, n):
            if nums[i] != 0:
                nums[i], nums[j] = nums[j], nums[i]
                j += 1
      
        
        
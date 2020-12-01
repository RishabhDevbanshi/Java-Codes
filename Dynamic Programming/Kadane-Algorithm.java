public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE, max_end=0;
        for(int i=0;i<nums.length;i++)
        {
            max_end += nums[i];
            max_sum = max_sum<max_end?max_end:max_sum;
            max_end = max_end<0?0:max_end;
        }
        return max_sum;
    }

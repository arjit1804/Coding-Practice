class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0, rsum=0;
        if(nums.length < 1)
            return -1;
        for(int i : nums)
            rsum += i;
        for(int i=0;i<nums.length;i++)
        {
            rsum = rsum - nums[i];
            if(rsum == lsum)
                return i;
            lsum = lsum + nums[i];
        }
        return -1;
        
    }
}

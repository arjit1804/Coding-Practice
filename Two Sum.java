import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c[] = new int[2];
        HashMap<Integer, Integer> A = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(A.containsKey(target - nums[i]))
            {
                c[1] = i;
                c[0] = A.get(target - nums[i]);
                return c;
            }
            A.put(nums[i] , i);
        }
        return c;
    }
}
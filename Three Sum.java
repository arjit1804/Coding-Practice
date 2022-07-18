class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0,l,r;
        if(nums.length < 3) return new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        ArrayList<List<Integer>> A = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length-2;i++){
            l = i+1; r = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]) // Skip duplicates from left
                continue;
            while(l<r){
                sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    A.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while(l<r && nums[r] == nums[r+1]) // Skip Duplicates from right
                        --r;
                }
                else if(sum > 0)
                    --r;
                else
                    ++l;
            }
        }
        return A;
    }
}


# Way 2
  
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0,l,r;
        if(nums.length < 3) return new ArrayList<List<Integer>>();
        
        Set<List<Integer>> A = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            l = i+1; r = nums.length-1;
            while(l<r){
                sum = nums[i] + nums[l] + nums[r];
                if(sum == 0)
                    A.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                else if(sum > 0)
                    --r;
                else
                    ++l;
            }
        }
        return new ArrayList<>(A);
    }
}

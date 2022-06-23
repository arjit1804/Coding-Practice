import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int count[] = new int[1001];
        int res[] = new int[1001];
        for(int i : nums1)
            count[i]++;
        int c=0;
        for(int i: nums2){
            if(count[i] > 0){ 
                res[c++] = i;
                count[i]--;
            } 
        }
        return Arrays.copyOfRange(res,0,c);
    }
}
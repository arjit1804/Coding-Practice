import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count[] = new int[1001];
        HashSet<Integer> A = new HashSet<Integer>();
        int c=0;
        for(int i : nums1)
            count[i]++;
        for(int i : nums2)
            if(count[i]>0){
                A.add(i);
                count[i]--;
            }
        int[] arr = A.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}

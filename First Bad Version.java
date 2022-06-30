public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, r = n,mid=0;
        while (l < r) {
            mid = l + (r-l) / 2;
            if (!isBadVersion(mid)) l = mid + 1;
            else r = mid;            
        }        
        return l;
    }
}

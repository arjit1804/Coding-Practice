class Solution {
    public int numberOfSteps(int num) {
        return fun(num,0);
    }
    private int fun(int n,int c){
        if(n==0)
            return c;
        if(n%2==0)
            return fun(n/2, ++c);
        else
            return fun(n-1, ++c);
    }
}

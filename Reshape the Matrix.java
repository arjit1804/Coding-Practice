class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c)
            return mat;
        int a=0,b=0;
        int res[][] = new int[r][c];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                res[a][b++] = mat[i][j];
                if (b == c) {
                    b = 0;
                    a++;
                }
            }
        }
        return res;
    }
}
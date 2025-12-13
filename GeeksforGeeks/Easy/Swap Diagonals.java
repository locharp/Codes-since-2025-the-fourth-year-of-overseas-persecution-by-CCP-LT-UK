class Solution
{
    
    public
    void
    swapDiagonal
    (
        int [][] mat
    )
    {
        
        
        for
        (
            int i = 0
                , j = mat.length - 1
                , t = mat[0][0]
            ; i < j
            ; i ++, j --, t = mat[i][i]
        )
        {
            mat[i][i] = mat[i][j];
            mat[i][j] = t;
            t = mat[j][i];
            mat[j][i] = mat[j][j];
            mat[j][j] = t;
        }
        
        
    }
    
}

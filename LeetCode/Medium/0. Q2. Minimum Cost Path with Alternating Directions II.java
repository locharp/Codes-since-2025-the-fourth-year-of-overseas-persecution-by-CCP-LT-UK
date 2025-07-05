class Solution
{
    
    public
    long
    minCost
    (
        int m
        , int n
        , int[][] waitCost
    )
    {
        long[][] mat = new long[m][n];
        getMat( mat, waitCost );


        for
        (
            int i = 1
            ; i < m
            ; i ++
        )
        {
            mat[i][0] += mat[i - 1][0];
        }

        
        for
        (
            int i = 1
            ; i < n
            ; i ++
        )
        {
            mat[0][i] += mat[0][i - 1];
        }
        

        for
        (
            int i = 1
            ; i < m
            ; i ++
        )
        {


            for
            (
                int j = 1
                ; j < n
                ; j ++
            )
            {
                mat[i][j] += Math.min( mat[i - 1][j], mat[i][j - 1] );
            }
            
            
        }


        return mat[m - 1][n - 1];
    }
        




    void
    getMat
    (
        long[][] mat
        , int[][] costs
    )
    {
        costs[0][0] = 0;
        costs[costs.length - 1][costs[0].length - 1] = 0;
        
        
        for
        (
            int i = 0
            ; i < costs.length
            ; i ++
        )
        {


            for
            (
                int j = 0
                ; j < costs[0].length
                ; j ++
            )
            {
                mat[i][j] = costs[i][j] + ( ( i + 1 ) * ( j + 1 ) );
            }

            
        }


    }
    
}

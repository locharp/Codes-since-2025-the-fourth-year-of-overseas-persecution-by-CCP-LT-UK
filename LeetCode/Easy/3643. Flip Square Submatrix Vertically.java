class Solution
{
    
    public
    int[][]
    reverseSubmatrix
    (
        int[][] grid
        , int x
        , int y
        , int k
    )
    {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        int x2 = x + k;
        int x3 = x2 - 1;
        int y2 = y + k;
        

        for
        (
            int i = 0
            ; i < m
            ; i ++
        )
        {
            ans[i] = Arrays.copyOf( grid[i], n );
        }


        for
        (
            int i = 0
            ; i < k
            ; i ++
        )
        {


            for
            (
                int j = y
                ; j < y2
                ; j ++
            )
            {
                ans[x + i][j] = grid[x3 - i][j];
            }

            
        }


        return ans;
    }
    
}

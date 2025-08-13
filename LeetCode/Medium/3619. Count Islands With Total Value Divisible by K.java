class Solution
{
    
    public
    int
    countIslands
    (
        int[][] grid
        , int k
    )
    {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] mat = new boolean[m][n];
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int ans = 0;


        for
        (
            int i = 0
            ; i < m
            ; i ++
        )
        {


            for
            (
                int j = 0
                ; j < n
                ; j ++
            )
            {
                int val = f( grid, mat, dir, i, j );

                if
                (
                    val > 0
                    && val % k == 0
                )
                {
                    ans ++;
                }
                
            }

            
        }


        return ans;
    }




    int
    f
    (
        int[][] grid
        , boolean[][] mat
        , int[][] dir
        , int i
        , int j
    )
    {

        if
        (
            i < 0
            || i >= mat.length
            || j < 0
            || j >= mat[0].length
            || mat[i][j]
            || grid[i][j] < 1
        )
        {
            return 0;
        }

        int val = grid[i][j];
        mat[i][j] = true;
        

        for
        (
            int[] d
            : dir
        )
        {
            val += f( grid, mat, dir, i + d[0], j + d[1] );
        }


        return val;
    }
    
}

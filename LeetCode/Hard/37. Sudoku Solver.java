class Solution
{

    public
    void
    solveSudoku
    (
        char[][] board
    )
    {
        int[][] grid = new int[9][9];
        int[][] idx = new int[9][9];
        boolean[][][] cache = new boolean[3][9][10];


        for
        (
            int i = 0
            ; i < 9
            ; i ++
        )
        {


            for
            (
                int j = 0
                ; j < 9
                ; j ++
            )
            {
                idx[i][j] = ( i / 3 * 3 ) + ( j / 3 );

                if
                (
                    board[i][j] > '0'
                )
                {
                    grid[i][j] = Character.getNumericValue( board[i][j] );
                    cache[0][i][grid[i][j]] = true;
                    cache[1][j][grid[i][j]] = true;
                    cache[2][idx[i][j]][grid[i][j]] = true;
                }

            }


        }


        solve( grid, idx, cache, 0 , 0 );


        for
        (
            int i = 0
            ; i < 9
            ; i ++
        )
        {


            for
            (
                int j = 0
                ; j < 9
                ; j ++
            )
            {
                board[i][j] = Character.forDigit( grid[i][j], 10 );
            }


        }

    }





    boolean
    solve
    (
        int[][] grid
        , int[][] idx
        , boolean[][][] cache
        , int r
        , int c
    )
    {

        if
        (
            c > 8
        )
        {

            if
            (
                r > 7
            )
            {
                return true;
            }
            else
            {
                c = 0;
                r ++;
            }

        }

        if
        (
            grid[r][c] > 0
        )
        {
            return solve( grid, idx, cache, r, c + 1 );
        }


        for
        (
            char i = 1
            ; i <= 9
            ; i ++ 
        )
        {
            
            if
            (
                cache[0][r][i]
                || cache[1][c][i]
                || cache[2][idx[r][c]][i]
            )
            {
                continue;
            }
            else
            {
                cache[0][r][i] = true;
                cache[1][c][i] = true;
                cache[2][idx[r][c]][i] = true;
                
                if
                (
                    solve( grid, idx, cache, r, c + 1 )
                )
                {
                    grid[r][c] = i;


                    return true;
                }

                cache[0][r][i] = false;
                cache[1][c][i] = false;
                cache[2][idx[r][c]][i] = false;
            }

        }


        return false;
    }
    
}

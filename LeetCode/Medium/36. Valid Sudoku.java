// 2 ms, 45 MB
class Solution
{

    public
    boolean
    isValidSudoku
    (
        char[][] board
    )
    {
        int[][] idx = new int[9][9];
        boolean[][][] arr = new boolean[3][9][10];


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
                int k = ( i / 3 * 3 ) + ( j / 3 );
                int n = Character.getNumericValue( board[i][j] );

                if
                (
                    n < 1
                )
                {
                    continue;
                }

                if
                (
                    arr[0][i][n]
                    || arr[1][j][n]
                    || arr[2][k][n]
                )
                {
                    return false;
                }
                
                arr[0][i][n] = true;
                arr[1][j][n] = true;
                arr[2][k][n] = true;
            }


        }


        return true;
    }

}

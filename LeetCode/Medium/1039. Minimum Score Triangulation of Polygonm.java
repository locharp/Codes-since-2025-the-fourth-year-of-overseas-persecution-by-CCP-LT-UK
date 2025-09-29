class Solution
{
    int n;
    int[] values;
    int[][] cache;




    public
    int
    minScoreTriangulation
    (
        int[] values
    )
    {
        n = values.length;
        this.values = values;
        cache = new int[n][n];


        return dp( 0, n - 1 );
    }




    int
    dp
    (
        int i
        , int j
    )
    {

        if
        (
            i + 2 > j
        )
        {
            return 0;
        }
        else if
        (
            cache[i][j] > 0
        )
        {
            return cache[i][j];
        }

        int minScore = Integer.MAX_VALUE;


        for
        (
            int k = i + 1
            ; k < j
            ; k ++
        )
        {
            minScore = Math.min
            (
                minScore
                , values[i] * values[j] * values[k] + dp( i, k ) + dp ( k, j )
            );
        }


        cache[i][j] = minScore;


        return minScore;
    }
   
}


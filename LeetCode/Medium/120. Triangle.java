class Solution
{
    
    public
    int
    minimumTotal
    (
        List < List < Integer > > triangle
    )
    {
        int n = triangle.size();
        int[][] cache = new int[n][n];


        for
        (
            int[] arr
            : cache
        )
        {
            Arrays.fill( arr, Integer.MIN_VALUE );
        }


        return solve( triangle, cache, 0, 0 );
    }




    int
    solve
    (
        List < List < Integer > > triangle
        , int[][] cache
        , int i
        , int j
    )
    {

        if
        (
            i == triangle.size()
        )
        {
            return 0;
        }
        else if
        (
            cache[i][j] > Integer.MIN_VALUE
        )
        {
            return cache[i][j];
        }
        
        cache[i][j] = triangle.get( i ).get ( j )
            + Math.min
            (
                solve( triangle, cache, i + 1, j )
                , solve( triangle, cache, i + 1, j + 1 )
            );


        return cache[i][j];
    }
    
}

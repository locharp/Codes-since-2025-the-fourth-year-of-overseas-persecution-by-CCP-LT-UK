class Solution
{
   
    public
    List < List < Integer > >
    pacificAtlantic
    (
        int[][] heights
    )
    {
        ArrayList < List <Integer > > ans = new ArrayList <> ();
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] cacheA = new boolean[m][n];
        boolean[][] cacheP = new boolean[m][n];
        
        
        for
        (
             int i = 0
            ; i < m
            ; i ++
        )
        {
            cacheP[i][0] = true;
            cacheA[i][n - 1] = true;
        }
        
        
        for
        (
             int i = 0
            ; i < n
            ; i ++
        )
        {
            cacheP[0][i] = true;
            cacheA[m - 1][i] = true;
        }
        
        
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
                solve( heights, cacheA, i, j );
                solve( heights, cacheP, i, j );
            }
           
           
        }
       
       
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
                
                if
                (
                    cacheA[i][j]
                    && cacheP[i][j]
                )
                {
                    ans.add( List.of( i, j ) );
                }
                
            }
           
           
        }
       
       
        return ans;
    }
   
   
   
   
    void
    solve
    (
        int[][] heights
        , boolean[][] cache
        , int i
        , int j
    )
    {
        
        if
        (
            !cache[i][j]
        )
        {
            return;
        }
        
        if
        (
            i > 0
            && heights[i][j] <= heights[i - 1][j]
            && !cache[i - 1][j]
        )
        {
            cache[i - 1][j] = true;
            solve( heights, cache, i - 1, j );
        }
        
        if
        (
            i + 1 < heights.length
            && heights[i][j] <= heights[i + 1][j]
            && !cache[i + 1][j]
        )
        {
            cache[i + 1][j] = true;
            solve( heights, cache, i + 1, j );
        }
        
        if
        (
            j > 0
            && heights[i][j] <= heights[i][j - 1]
            && !cache[i][j - 1]
        )
        {
            cache[i][j - 1] = true;
            solve( heights, cache, i, j - 1 );
        }
        
        if
        (
            j + 1 < heights[0].length
            && heights[i][j] <= heights[i][j + 1]
            && !cache[i][j + 1]
        )
        {
            cache[i][j + 1] = true;
            solve( heights, cache, i, j + 1 );
        }
        
    }
    
}

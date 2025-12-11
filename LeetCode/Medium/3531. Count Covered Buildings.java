class Solution
{
    
    public
    int
    countCoveredBuildings
    (
        int n
        , int [][] buildings
    )
    {
        int ans = 0;
        int [] rMin = new int [ n + 1];
        int [] rMax = new int [ n + 1 ];
        int [] cMin = new int [ n + 1 ];
        int [] cMax = new int [ n + 1 ];
        Arrays.fill( rMin, n );
        Arrays.fill( cMin, n );
        
        
        for
        (
            int [] building
            : buildings
        )
        {
            int r = building[0];
            int c = building[1];
            rMin[c] = Math.min( rMin[c], r );
            rMax[c] = Math.max( rMax[c], r );
            cMin[r] = Math.min( cMin[r], c );
            cMax[r] = Math.max( cMax[r], c );
        }
        
        
        for
        (
            int [] building
            : buildings
        
        )
        {
            int r = building[0];
            int c = building[1];
            
            if
            (
                r > rMin[c]
                && r < rMax[c]
                && c > cMin[r]
                && c < cMax[r]
            )
            {
                ans ++;
            }
            
        }
        
        
        return ans;
    }
    
}

zclass Solution
{
    
    public
    long
    minTime
    (
        int[] skill
        , int[] mana
    )
    {
        int n = skill.length;
        int m = mana.length;
        long[] dp = new long[n];
        long s = 0;
        
        
        for
        (
            int i = 0
            ; i < m
            ; i ++
        )
        {
            dp[0] += skill[0] * mana[i];
            long r = 0;
            
            
            for
            (
                int j = 1
                ; j < n
                ; j ++
            )
            {
                r = Math.max( r, dp[j] - dp[j - 1] );
                dp[j] = dp[j - 1] + ( skill[j] * mana[i] );
            }
            
            
            s += r;
        }
        
        
        return dp[n - 1] + s;
    }
    
}
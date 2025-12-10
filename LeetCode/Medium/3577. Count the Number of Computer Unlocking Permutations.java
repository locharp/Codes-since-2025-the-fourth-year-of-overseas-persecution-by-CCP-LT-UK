class Solution
{
    
    public
    int
    countPermutations
    (
        int [] complexity
    )
    {
        final long MOD = 1000000007;
        final int n = complexity.length;
        long ans = 1;
        
        
        for
        (
            int i = 1
            ; i < n
            ; i ++
        )
        {
            
            if
            (
                complexity[0]>= complexity[i]
            )
            {
                return 0;
            }
            
            ans = ( ans * i ) % MOD;
        }
        
        
        return ( int ) ( ans );
    }
    
}

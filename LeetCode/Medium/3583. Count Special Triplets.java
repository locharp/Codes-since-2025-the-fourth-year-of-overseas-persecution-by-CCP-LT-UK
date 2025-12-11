class Solution 
{
    
    public
    int
    specialTriplets
    (
        int [] nums
    )
    {
        final int MOD = 1000000007;
        final int n = nums.length;
        int ans = 0;
        final HashMap < Integer, Integer > hashMap1 = new HashMap <> ();
        final HashMap < Integer, Integer > hashMap2 = new HashMap <> ();
        
        
        for
        (
            int num
            : nums
        )
        {
            
            if
            (
                num % 2 == 0
            )
            {
                ans = ( ans + hashMap2.getOrDefault( num / 2, 0 ) ) % MOD;
            }
            
            hashMap2.put( num, ( hashMap1.getOrDefault( num * 2, 0 ) + hashMap2.getOrDefault( num, 0 ) ) % MOD );
            hashMap1.put( num, hashMap1.getOrDefault( num, 0 ) + 1 );
        }
        
        
        return ans;
    }
    
}

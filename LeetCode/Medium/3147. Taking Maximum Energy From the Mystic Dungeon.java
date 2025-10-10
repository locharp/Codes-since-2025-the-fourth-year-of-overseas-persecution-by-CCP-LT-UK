class Solution
{
    
    public
    int
    maximumEnergy
    (
        int[] energy
        , int k
    )
    {
        int n = energy.length;
        int ans = energy[n - 1];
        int j = Math.max( 0, n - k - 1);
        
        
        for
        (
            int i = n - 2
            ; i > j
            ; i --
        )
        {
            ans = Math.max( ans, energy[i] );
        }
        
        
        for
        (
            int i = j
            ; i >= 0
            ; i --
        )
        {
            energy[i] += energy[i + k];
            ans = Math.max( ans, energy[i] );
        }
        
        
        return ans;
    }
    
}
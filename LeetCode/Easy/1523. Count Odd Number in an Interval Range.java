class Solution
{
    
    public
    int
    countOdds
    (
        int low
        , int high
    )
    {
        int ans = ( high - low + 1 ) / 2;
        
        if
        (
            ( low & high & 1 ) == 1
        )
        {
            ans += 1;
        }
        
        
        return ans;
    }
    
}

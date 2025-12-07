class Solution
{
    
    func
    countOdds
    (
        low: Int64
        , high: Int64
    )
    : Int64
    {
        var ans = ( high - low + 1 ) / 2;
        
        if
        (
            ( low & high & 1 ) == 1
        )
        {
            ans ++;
        }
        
        ans
    }
    
}

class Solution
{
    
    func
    minNumberOperations
    (
        target: Array < Int64 >
    )
    : Int64
    {
        var ans: Int64 = 0;
        var prev: Int64 = 0;
        
        
        for
        (
            num
            in
            target
        )
        {
            ans += max( 0, num - prev )
            prev = num
        }
        
        
        return ans;
    }
    
}

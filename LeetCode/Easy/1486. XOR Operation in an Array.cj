class Solution
{
    
    func
    xorOperation
    (
        n: Int64
        , start: Int64
    )
    : Int64
    {
        var ans: Int64 = 0
        
        
        for
        (
            num
            in
            start..( start + ( 2 * n ) ) : 2
        )
        {
            ans ^= num
        }
        
        
        return ans
    }
  
}

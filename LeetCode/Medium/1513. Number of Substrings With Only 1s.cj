class Solution
{
    
    func
    numSub
    (
        s: String
    )
    : Int64
    {
        const ZERO: UInt8 = '0'
        var ans: Int64 = 0
        var ones: Int64 = 0
        
        
        for
        (
            r
            in
            s
        )
        {
            
            if
            (
                r == ZERO
            )
            {
                ones = 0
            }
            else
            {
                ones ++
                ans += ones
            }
            
        }
        
        
        ans % 1000000007
    }
    
}

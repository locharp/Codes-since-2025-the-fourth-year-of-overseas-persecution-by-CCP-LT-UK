class Solution
{
    
    func
    kLengthApart
    (
        nums: Array < Int64 >
        , k: Int64
    )
    : Bool
    {
        var j: Int64 = k
        
        
        for
        (
            num
            in
            nums
        )
        {
            
            if
            (
                num < 1
            )
            {
                j ++
            }
            else
            {
                
                if
                (
                    j < k
                )
                {
                    return false
                }
                
                j = 0
            }
            
        }
        
        
        true
    }
    
}

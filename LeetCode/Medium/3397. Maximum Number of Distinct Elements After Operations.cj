class Solution 
{
    
    func
    maxDistinctElements
    (
        nums: Array < Int64 >
        , k: Int64
    )
    : Int64 
    {
        sort( nums )
        var prev: Int64 = Int64.Min
        var ans: Int64 = 0
        
        
        for
        (
            num
            in
            nums
        )
        {
            
            if
            (
                prev < num - k
            )
            {
                prev = num - k
                ans ++
            }
            else if
            (
                prev < num + k
            )
            {
                prev ++
                ans ++
            }
            
        }
        
        
        return ans
    }
    
}

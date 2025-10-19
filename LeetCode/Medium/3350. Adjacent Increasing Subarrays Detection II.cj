class Solution
{
    
    func
    maxIncreasingSubarrays
    (
        nums : ArrayList < Int64 >
    )
    : Int64
    {
        var ans : Int64 =0
        var high : Int64 = 0
        var low : Int64 = 0
        var prev : Int64 = 1
        var count : Int64 = 0
        var last : Int64 = Int64.Min
        
        
        for
        (
            num
            in
            nums
        )
        {
            
            if
            (
                num > last
            )
            {
                count++
                high = max( high, count )
                low = min( prev, count )
                ans = max( ans, high / 2 )
                ans = max( ans, low )
            }
            else
            {
                prev = count
                count = 1
            }
            
            last = num
        }
        
        
        return ans
    }
    
}

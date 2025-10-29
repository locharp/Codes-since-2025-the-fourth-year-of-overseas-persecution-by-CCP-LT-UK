class Solution
{
    
    func
    smallestNumber
    (
        n: Int64
    )
    : Int64
    {
        var ans = n
        var o = 1
        
        
        while
        (
            ans > o
        )
        {
            ans |= o
            o <<= 1
        }
        
         
        return ans
    }
    
}

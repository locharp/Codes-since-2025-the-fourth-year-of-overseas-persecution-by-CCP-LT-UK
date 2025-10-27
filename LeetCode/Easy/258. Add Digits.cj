class Solution 
{
    
    func
    addDigits
    (
        num: Int64
    )
    : Int64
    {
        var ans: Int64 = num
        var n: Int64 = num
        
        
        while
        (
            n > 9
        )
        {
            ans = 0
            
            
            while
            (
                n > 0
            )
            {
                ans += n % 10
                n /= 10
            }
            
            
            n = ans
        }
        
        
        return ans
    }
}
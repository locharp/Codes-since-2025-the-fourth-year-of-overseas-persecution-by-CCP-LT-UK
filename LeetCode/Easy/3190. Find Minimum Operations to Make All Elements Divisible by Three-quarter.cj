class Solution
{
    
    func
    minimumOperations
    (
        nums: Array < Int64 >
    )
    : Int64
    {
        var ans: Int64 = 0
        
        
        for
        (
            num
            in
            nums
        )
        {
            let m = num % 3
            ans += min( m, 3 - m )
        }
        
        
        ans
    }
    
}

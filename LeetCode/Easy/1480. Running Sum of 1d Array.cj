class Solution
{
    
    func
    runningSum
    (
        nums: Array < Int64 >
    )
    : Array < Int64 >
    {
        var sum: Int64 = 0
        let ans: Array < Int64 > = Array( nums.size, repeat: 0 )
        ans[0] = nums[0]
        
        
        for
        (
            i
            in
            1..nums.size
        )
        {
            ans[i] = ans[i - 1] + nums[i]
        }
        
        
        ans
    }
    
}

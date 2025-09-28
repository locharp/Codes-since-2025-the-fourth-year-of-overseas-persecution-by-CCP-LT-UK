class Solution
{
    
    public
    int
    largestPerimeter
    (
        int[] nums
    )
    {
        Arrays.sort( nums );
        int n =  nums.length;
        int first = nums[n - 1];
        int second = nums[n - 2];
        
        
        for
        (
            int i = n - 3
            ; i >= 0
            ; i --
        )
        {
            
            if
            (
                first < second + nums[i]
            )
            {
                return first + second + nums[i];
            }
            else
            {
                first = second;
                second = nums[i];
            }
        }
        
        
        return 0;
    }
    
}

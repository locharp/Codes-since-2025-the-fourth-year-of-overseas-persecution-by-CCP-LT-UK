class Solution
{
    
    public
    int
    maxDistinctElements
    (
        int[] nums
        , int k
    )
    {
        Arrays.sort( nums );
        int prev = Integer.MIN_VALUE;
        int ans = 0;
        
        
        for
        (
            int num
            : nums
        )
        {
            int curr = num - k;
            
            if
            (
                prev >= curr
            )
            {
                
                if
                (
                    prev < num + k
                )
                {
                    prev ++;
                    ans ++;
                }
                
            }
            else
            {
                prev = curr;
                ans ++;
            }
            
        }
        
        
        return ans;
    }
    
}

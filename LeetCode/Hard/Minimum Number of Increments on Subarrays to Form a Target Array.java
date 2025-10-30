class Solution
{
    
    public
    int
    minNumberOperations
    (
        int[] target
    )
    {
        int ans = 0;
        int prev = 0;
        
        
        for
        (
            int num
            : target
        )
        {
            ans += Math.max( 0, num - prev );
            prev = num;
        }
        
        
        return ans;
    }
}

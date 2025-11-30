class Solution
{
    
    public
    int
    countElements
    (
        int[] nums
        , int k
    )
    {
        int n = nums.length;
        
        if
        (
            k == 0
        )
        {
            return n;
        }
        
        Arrays.sort( nums );
        int ans = n - k;
        
        
        while
        (
            ans > 0
            && nums[ans] == nums[ans - 1]
        )
        {
            ans --;
        }
        
        return ans;
    }
    
}

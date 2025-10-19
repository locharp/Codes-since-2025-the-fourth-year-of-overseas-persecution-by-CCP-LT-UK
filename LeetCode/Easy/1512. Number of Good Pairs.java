class Solution
{
    
    public
    int
    numIdenticalPairs
    (
        int[] nums
    )
    {
        int[] arr = new int[101];
        int ans = 0;
        
        
        for
        (
            int num
            : nums
        )
        {
            ans += arr[num];
            arr[num] ++;
        }
        
        
        return ans;
    }
    
}

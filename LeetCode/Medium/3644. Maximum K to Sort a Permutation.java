class Solution
{
    
    public
    int
    sortPermutation
    (
        int[] nums
    )
    {
        int ans = Integer.MAX_VALUE;
        

        for
        (
            int i = 0
            ; i < nums.length
            ; i ++
        )
        {

            if
            (
                nums[i] != i
            )
            {
                ans &= nums[i];
            }
            
        }


        if
        (
            ans > 100000
        )
        {
            return 0;
        }
        else
        {
            return ans;
        }
        
    }
    
}

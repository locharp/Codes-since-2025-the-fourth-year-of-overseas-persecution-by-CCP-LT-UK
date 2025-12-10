class Solution
{

    public
    int
    removeElement
    (
        int [] nums
        , int val
    )
    {
        final int n = nums.length;
        int ans = 0;
        

        for
        (
            int j = 0
            ; j < n
            ; j ++
        )
        {

            if
            (
                nums[j] != val
            )
            {
                nums[ans] = nums[j];
                ans ++;
            }

        }

        
        return ans;
    }

}

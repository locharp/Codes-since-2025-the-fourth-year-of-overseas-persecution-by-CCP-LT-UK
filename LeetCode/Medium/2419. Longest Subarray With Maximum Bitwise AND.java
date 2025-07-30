class Solution
{

    public
    int
    longestSubarray
    (
        int[] nums
    )
    {
        int ans = 0;
        int c = 0;
        int m = 0;


        for
        (
            int num
            : nums
        )
        {
            
            if
            (
                num > m
            )
            {
                m = num;
                c = 1;
                ans = 1;
            }
            else if
            (
                num < m
            )
            {
                c = 0;
            }
            else
            {
                c ++;
                ans = Math.max( ans, c );
            }

        }


        return ans;
    }

}

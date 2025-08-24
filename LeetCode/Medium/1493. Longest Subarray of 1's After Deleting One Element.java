class Solution
{
    public
    int
    longestSubarray
    (
        int[] nums
    )
    {
        int n = nums.length;
        int j = 0;


        while
        (
            j < n
            && nums[j] != 0
        )
        {
            j ++;
        }


        if
        (
            j == n
        )
        {
            return n - 1;
        }

        int ans = 1;
        int i = 0;
        int k = j + 1;


        while
        (
            k < n
        )
        {

            if
            (
                nums[k] < 1
            )
            {
                ans = Math.max( ans, k - i );
                i = j + 1;
                j = k;
            }

            k ++;
        }


        return Math.max( ans, k - i ) - 1;
    }

}

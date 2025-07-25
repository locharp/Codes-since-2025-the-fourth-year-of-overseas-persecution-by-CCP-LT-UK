class Solution
{

    public
    int
    maxSum
    (
        int[] nums
    )
    {
        boolean[] arr = new boolean[101];
        int ans = 0;
        int max = -100;


        for
        (
            int num
            : nums
        )
        {

            if
            (
                num > 0
                && !arr[num]
            )
            {
                ans += num;
                arr[num] = true;
            }

            max = Math.max( max, num );
        }


        if
        (
            ans < 1
        )
        {
            return max;
        }
        else
        {
            return ans;
        }

    }

}

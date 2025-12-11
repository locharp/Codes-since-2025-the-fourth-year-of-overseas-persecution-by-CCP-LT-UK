class Solution
{

    public
    int
    minSubArrayLen
    (
        int target
        , int [] nums
    )
    {
        final int n = nums.length;
        int ans = 100001;


        for
        (
            int i = 0
                , j = 0
                , sum = 0
            ; j < n
            ; j ++
        )
        {
            sum += nums[j];

            if
            (
                sum >= target
            )
            {


                while
                (
                    sum >= target
                )
                {
                    sum -= nums[i];

                    i ++;
                }


                ans = Math.min( ans, j - i + 2 );
            }
        }


        if
        (
            ans > n
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

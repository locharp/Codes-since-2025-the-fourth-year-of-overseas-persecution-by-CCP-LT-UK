class Solution
{

    public
    int
    countHillValley
    (
        int[] nums
    )
    {
        int ans = 0;
        int o = 0;
        int p = nums[0];


        for
        (
            int num
            : nums
        )
        {
            int q = p - num;

            if
            (
                q > 0
            )
            {
                
                if
                (
                    o < 0
                )
                {
                    ans ++;
                }

                o = q;
            }
            else if
            (
                q < 0
            )
            {

                if
                (
                    o > 0
                )
                {
                    ans ++;
                }

                o = q;
            }

            p = num;
        }


        return ans;
    }

}

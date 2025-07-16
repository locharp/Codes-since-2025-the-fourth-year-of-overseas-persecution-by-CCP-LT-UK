class Solution
{

    public
    int
    maximumLength
    (
        int[] nums
    )
    {
        int e = 0;
        int o = 0;
        int p = 0;
        boolean q = nums[0] % 2 < 1;


        for
        (
            int num
            : nums
        )
        {
            boolean t = num % 2 > 0;

            if
            (
                t
            )
            {
                o ++;
            }
            else
            {
                e ++;
            }

            if
            (
                t != q
            )
            {
                q = t;
                p ++;
            }

        }

        
        return Math.max( Math.max( e, o ), p );
    }

}

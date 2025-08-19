class Solution
{

    public
    long
    zeroFilledSubarray
    (
        int[] nums
    )
    {
        long ans = 0;
        long c = 0;
        

        for
        (
            int num
            : nums
        )
        {

            if
            (
                num == 0
            )
            {
                c ++;
            }
            else
            {
                ans += c * ( c + 1 ) / 2;
                c = 0;
            }

        }


        return ans + ( c * ( c + 1 ) / 2 );
    }

}

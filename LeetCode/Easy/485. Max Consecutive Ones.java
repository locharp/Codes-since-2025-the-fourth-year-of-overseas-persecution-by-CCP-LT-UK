class Solution
{

    public
    int
    findMaxConsecutiveOnes
    (
        int [] nums
    )
    {
        final int n = nums.length;
        int ans = 0;
        int ones = 0;


        for
        (
            int num
            : nums
        )
        {

            if
            (
                num == 1
            )
            {
                ones ++;
                ans = Math.max( ans, ones );
            }
            else
            {
                ones = 0;
            }

        }


        return ans;
    }

}

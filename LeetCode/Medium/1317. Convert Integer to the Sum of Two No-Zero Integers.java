// 1 ms, 42 MB
class Solution
{
    public
    int[]
    getNoZeroIntegers
    (
        int n
    )
    {
        int[] ans = new int[2];
        String s = Integer.toString( n );
        int m = s.length();
        ans[0] = Integer.valueOf( "1".repeat( Math.max( 1, m - 1 ) ) );
        ans[1] = n - ans[0];
        int p = 1;


        while
        (
            ans[1] / p > 0
        )
        {
            
            if
            (
                ans[1] / p % 10 < 1
            )
            {
                ans[0] += p;
                ans[1] -= p;
            }

            p *= 10;
        }


        return ans;
    }

}

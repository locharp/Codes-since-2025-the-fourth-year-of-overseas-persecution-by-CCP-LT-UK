// 1 ms, 45 MB
class Solution
{

    public
    int
    areaOfMaxDiagonal
    (
        int[][] dimensions
    )
    {
        int ans = 0;
        double d = 0;


        for
        (
            int[] dimension
            : dimensions
        )
        {
            double c = Math.sqrt
            (
                dimension[0] * dimension[0]
                + dimension[1] * dimension[1]
            );

            if
            (
                c > d
            )
            {
                ans = dimension[0] * dimension[1];
                d = c;
            }
            else if
            (
                c == d
            )
            {
                ans = Math.max( ans, dimension[0] * dimension[1] );
            }

        }


        return ans;
    }

}

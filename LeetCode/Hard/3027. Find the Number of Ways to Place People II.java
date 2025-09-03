// 66 ms, 46 MB
class Solution
{

    public
    int
    numberOfPairs
    (
        int[][] points
    )
    {
        Arrays.sort( points, new PointComparator() );
        int ans = 0;
        int n = points.length;


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            int x = points[i][0];
            int y = points[i][1];
            int p = x - 1;
            int q = Integer.MIN_VALUE;

            
            for
            (
                int j = i + 1
                ; j < n
                ; j ++
            )
            {

                if
                (
                    points[j][0] > p
                    && points[j][1] >= q
                    && points[j][1] <= y
                )
                {
                    ans ++;
                    p = points[j][0];
                    q = points[j][1] + 1;
                }

            }


        }


        return ans;
    }

}






class PointComparator
implements Comparator < int[] >
{

    @Override
    public
    int
    compare
    (
        int[] x
        , int[] y
    )
    {

        if
        (
            x[0] != y[0]
        )
        {
            return Integer.compare( x[0], y[0] );
        }
        else
        {
            return Integer.compare( y[1], x[1] );
        }

    }

}

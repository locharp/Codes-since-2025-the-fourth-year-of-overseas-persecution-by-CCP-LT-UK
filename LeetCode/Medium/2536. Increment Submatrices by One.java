class Solution
{

    public
    int[][]
    rangeAddQueries
    (
        int n
        , int[][] queries
    )
    {
        int[][] ans = new int[n][n];
        int m = n - 1;


        for
        (
            int[] query
            : queries
        )
        {
            ans[query[0]][query[1]] ++;

            if
            (
                query[2] < m
            )
            {
                ans[query[2] + 1][query[1]] --;

                if
                (
                    query[3] < m
                )
                {
                    ans[query[2] + 1][query[3] + 1] ++;
                }

            }

            if
            (
                query[3] < m
            )
            {
                ans[query[0]][query[3] + 1] --;
            }

        }


        for
        (
            int i = 1
            ; i < n
            ; i ++
        )
        {


            for
            (
                int j = 0
                ; j < n
                ; j ++
            )
            {
                ans[i][j] += ans[i - 1][j];
            }


        }


        for
        (
            int[] a
            : ans
        )
        {


            for
            (
                int i = 1
                ; i < n
                ; i ++
            )
            {
                a[i] += a[i - 1];
            }


        }


        return ans;
    }

}

// 5 ms, 46 MB
class Solution
{

    public
    int[][]
    sortMatrix
    (
        int[][] grid
    )
    {
        int n = grid.length;
        int[][] ans = new int[n][n];
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            int p = i;
            int q = 0;
            solve( grid, ans, p, q, Comparator.reverseOrder() );
        }


        for
        (
            int i = 1
            ; i < n
            ; i ++
        )
        {
            int p = 0;
            int q = i;
            solve( grid, ans, p, q, Comparator.naturalOrder() );
        }


        return ans;
    }





    void
    solve
    (
        int[][] grid
        , int[][] ans
        , int i
        , int j
        , Comparator comparator
    )
    {
        ArrayList < Integer > list = new ArrayList <> ();
        int n = grid.length;
        int p = i;
        int q = j;
        

        while
        (
            p < n
            && q < n
        )
        {
            list.add( grid[p][q] );
            p ++;
            q ++;
        }


        list.sort( comparator );
        p = i;
        q = j;
        int k = 0;


        while
        (
            p < n
            && q < n
        )
        {
            ans[p][q] = list.get( k );
            p ++;
            q ++;
            k ++;
        }


    }

}

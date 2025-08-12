class Solution
{

    public
    int
    numberOfWays
    (
        int n
        , int x
    )
    {
        int[] arr = new int[n + 1];
        int ans = 0;
        int MOD = 1000000007;
        arr[0] = 1;
        int p = 1;


        for
        (
            int i = 2
            ; p <= n
            ; i ++
        )
        {


            for
            (
                int j = n
                ; j >= p
                ; j --
            )
            {
                arr[j] = ( arr[j] + arr[j - p] ) % MOD;
            }


            p = ( int ) ( Math.pow( i, x ) );
        }


        return arr[n];
    }

}

class Solution
{

    public
    int
    numberOfWays
    (
        String corridor
    )
    {
        final long MOD = 1000000007;
        char [] arr = corridor.toCharArray();
        int n = arr.length;
        long s = 0;
        long p = 0;
        int i = 0;


        while
        (
            i < n
            && s < 2
        )
        {

            if
            (
                arr[i] == 'S'
            )
            {
                s ++;
            }

            i ++;
        }


        if
        (
            s < 2
        )
        {
            return 0;
        }


        while
        (
            i < n
            && arr[i] == 'P'
        )
        {
            p ++;

            i ++;
        }


        if
        (
            i == n
        )
        {
            return 1;
        }

        long ans = p + 1;
        s = 0;
        p = 0;


        while
        (
            i < n
        )
        {


            while
            (
                i < n
                && s < 2
            )
            {

                if
                (
                    arr[i] == 'S'
                )
                {
                    s ++;
                }
                
                i ++;
            }


            if
            (
                s == 1
            )
            {
                return 0;
            }


            while
            (
                i < n
                && arr[i] == 'P'
            )
            {
                p ++;

                i ++;
            }


            if
            (
                i == n
            )
            {
                break;
            }

            ans = ( ans * ( p + 1 ) ) % MOD;
            s = 0;
            p = 0;
        }


        return ( int ) ( ans );
    }

}

class Solution
{

    public
    boolean
    isPowerOfTwo
    (
        int n
    )
    {
        
        if
        (
            n < 1
        )
        {
            return false;
        }
        else if
        (
            n < 3
        )
        {
            return true;
        }
        else
        {
            int p = solve( n );


            return Math.pow( 2, p ) == n;
        }
        
    }





    int
    solve
    (
        int n
    )
    {

        if
        (
            n < 2
        )
        {
            return 0;
        }
        else if
        (
            n < 3
        )
        {
            return 1;
        }
        else
        {
            return 1 + solve( n / 2 );
        }

    }

}

class Solution
{

    public
    boolean
    isPowerOfFour
    (
        int n
    )
    {
        return Math.pow( 4, solve( n ) ) == n;
    }





    int
    solve
    (
        int n
    )
    {
        
        if
        (
            n < 4
        )
        {
            return 0;
        }
        else
        {
            return 1 + solve( n / 4 );
        }

    }

}

class Solution
{

    public
    boolean
    isPowerOfThree
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

        double log = Math.log( n ) / Math.log( 3 );
        log = Math.round( log );


        return Math.pow( 3, log ) == n;
    }

}

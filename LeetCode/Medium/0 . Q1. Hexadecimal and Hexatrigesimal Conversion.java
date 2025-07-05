class Solution
{
    
    public
    String
    concatHex36
    (
        int n
    )
    {
        return toS( n * n, 16 ) + toS( n * n * n, 36 );
    }





    String
    toS
    (
        int n
        , int d
    )
    {
        StringBuilder s = new StringBuilder();


        while
        (
            n > 0
        )
        {
            int r = n % d;
            
            if
            (
                r > 9
            )
            {
                s.append( ( char ) ( 'A' + ( r - 10 ) ) );
            }
            else
            {
                s.append( r );
            }
            
            n /= d;
        }


        return s.reverse().toString();
    }
    
}

class Solution
{
    
    public
    int
    compareVersion
    (
        String version1
        , String version2
    )
    {
        String[] v1 = version1.split( "\\." );
        String[] v2 = version2.split( "\\." );
        int n = Math.max( v1.length, v2.length );
        Integer r1 = 0;
        Integer r2 = 0;


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            r1 = 0;
            r2 = 0;

            if
            (
                i < v1.length
            )
            {
                r1 = Integer.valueOf( v1[i] );
            }

            if
            (
                i < v2.length
            )
            {
                r2 = Integer.valueOf( v2[i] );
            }

            if
            (
                !r1.equals( r2 )
            )
            {
                return r1.compareTo( r2 );
            }
            
        }


        return 0;
    }

}

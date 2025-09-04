class Solution
{
    
    public
    int
    findClosest
    (
        int x
        , int y
        , int z
    )
    {
        int ans = Math.abs( x - z ) - Math.abs( y - z );

        if
        (
            ans < 0
        )
        {
            return 1;
        }
        else if
        (
            ans > 0
        )
        {
            return 2;
        }
        else
        {
            return 0;
        }

    }

}

class Solution
{
    
    public
    int
    minSensors
    (
        int n
        , int m
        , int k
    )
    {
        int p = k * 2;
        int q = p + 1;

        
        return ( ( n + p ) / q ) * ( ( m + p ) /q );
    }
    
}
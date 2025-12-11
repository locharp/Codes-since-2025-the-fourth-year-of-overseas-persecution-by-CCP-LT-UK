class Solution
{
    
    public
    int
    maxDistinct
    (
        String s
    )
    {
        return ( int ) ( s.codePoints().distinct().count() );
    }
    
}

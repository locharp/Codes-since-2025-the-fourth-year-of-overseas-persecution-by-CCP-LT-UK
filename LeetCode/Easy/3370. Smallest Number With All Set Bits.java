class Solution
{
    public
    int
    smallestNumber
    (
        int n
    )
    {
        return Integer.valueOf
        (
            "1".repeat
            (
                Integer
                    .toBinaryString( n )
                    .length()
            )
            
            , 2
        );
    }

}

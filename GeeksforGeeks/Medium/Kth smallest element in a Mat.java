class Solution
{
    
    public
    int
    kthSmallest
    (
        int [][] mat
        , int k
    )
    {
        return Arrays.stream( mat )
            .flatMap( a -> Arrays.stream( a ).boxed() )
            .mapToInt( Integer::intValue ).sorted()
            .toArray()[k - 1];
    }
    
}

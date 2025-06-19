class Solution
{

    public
    int
    partitionArray
    (
        int[] nums
        , int k
    )
    {
        HashSet< Integer > set = new HashSet<>();
        ArrayList< Integer > list = new ArrayList<>();
        

        for
        (
            int i
            : nums
        )
        {
            
            if
            (
                !set.contains( i )
            )
            {
                list.add( i );
                set.add( i );
            }
            
        }


        Collections.sort( list );
        int ans = 1;
        int p = list.get( 0 );


        for
        (
            int i
            : list
        )
        {
            
            if
            (
                i - p > k
            )
            {
                p = i;
                ans ++;
            }

        }


        return ans;
    }

}

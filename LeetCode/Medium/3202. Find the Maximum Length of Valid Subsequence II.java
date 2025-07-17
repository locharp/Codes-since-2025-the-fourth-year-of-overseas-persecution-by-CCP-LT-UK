class Solution
{

    public
    int
    maximumLength
    (
        int[] nums
        , int k
    )
    {
        HashMap
        <
            Integer
            , HashMap < Integer, Integer >
        >
        map =
        new HashMap <> ();

        int ans = 1;


        for
        (
            int i
            : nums
        )
        {
            int r = i % k;
            
            if
            (
                !map.containsKey( r )
            )
            {
                map.put( r, new HashMap <> () );
            }

            HashMap < Integer, Integer > m = map.get( r );


            for
            (
                Integer j
                : map.keySet()
            )
            {
                m.put( j, map.get( j ).getOrDefault( r, j == r ? 0 : 1 ) + 1 );
            }


        }


        for
        (
            HashMap < Integer, Integer > m
            : map.values()
        )
        {

            for
            (
                int i
                : m.values()
            )
            {
                ans = Math.max( ans, i );
            }


        }


        return ans;
    }

}

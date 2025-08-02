class Solution
{

    public
    long
    minCost
    (
        int[] basket1
        , int[] basket2
    )
    {
        HashMap < Integer, Integer > map = new HashMap <> ();
        ArrayList < Integer > list = new ArrayList <> ();
        long ans = 0;
        int m = Integer.MAX_VALUE;


        for
        (
            int fruit
            : basket1
        )
        {
            map.put( fruit, map.getOrDefault( fruit, 0 ) + 1 );
            m = Math.min( m, fruit );
        }


        for
        (
            int fruit
            : basket2
        )
        {
            map.put( fruit, map.getOrDefault( fruit, 0 ) - 1 );
            m = Math.min( m, fruit );
        }


        for
        (
            var entry
            : map.entrySet()
        )
        {
            int value = entry.getValue();

            if
            (
                value % 2 != 0
            )
            {
                return -1;
            }

            value = Math.abs( value ) / 2;


            for
            (
                int i = 0
                ; i < value
                ; i ++
            )
            {
               list.add( entry.getKey() ); 
            }


        }


        Collections.sort( list );
        m *= 2;


        for
        (
            int fruit
            : list.subList( 0, list.size() / 2 )
        )
        {
            ans += Math.min( fruit, m );
        }


        return ans;
    }

}

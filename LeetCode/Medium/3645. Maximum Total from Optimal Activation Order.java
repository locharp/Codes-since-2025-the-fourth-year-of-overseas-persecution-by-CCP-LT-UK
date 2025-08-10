class Solution
{
    
    public
    long
    maxTotal
    (
        int[] value
        , int[] limit
    )
    {
        HashMap < Integer, ArrayList < Integer > > map = new HashMap <> ();
        ArrayDeque < Integer > dq = new ArrayDeque <> ();
        int k = 0;
        long ans = 0;


        for
        (
            int i = 0
            ; i < value.length
            ; i ++
        )
        {

            if
            (
                !map.containsKey( limit[i] )
            )
            {
                map.put( limit[i], new ArrayList <> () );
            }

            map.get( limit[i] ).add( value[i] );
        }


        for
        (
            ArrayList < Integer > list
            : map.values()
        )
        {
            Collections.sort( list );
        }


        ArrayList < Integer > list = new ArrayList <> ( map.keySet() );
        Collections.sort( list );


        for
        (
            Integer i
            : list
        )
        {

            while
            (
                i > k
                && !map.get( i ).isEmpty()
            )
            {
                ans += map.get( i ).removeLast();
                dq.offerLast( i );
                k = Math.max( k, dq.size() );


                while
                (
                    !dq.isEmpty()
                    && dq.peekFirst() <= dq.size()
                )
                {
                    dq.pollFirst();
                }

                
            }

            
        }


        return ans;
    }
    
}

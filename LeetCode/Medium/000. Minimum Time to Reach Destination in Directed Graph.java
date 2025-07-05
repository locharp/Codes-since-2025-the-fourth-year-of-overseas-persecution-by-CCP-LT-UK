class Solution
{
    
    public
    int
    minTime
    (
        int n
        , int[][] edges
    )
    {
        HashMap < Integer, ArrayList< int[] > > map = new HashMap <> ();
        PriorityQueue < int[] > pq =
            new PriorityQueue <> ( ( x, y ) -> Integer.compare( x[0], y[0] ) );
        pq.offer( new int[] { 0, 0 } );

        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            map.put( i, new ArrayList <> () );
        }


        for
        (
            int[] edge
            : edges
        )
        {
            map.get( edge[0] ).add( edge );
        }


        while
        (
            !pq.isEmpty()
            && pq.peek()[0] < ans
        )
        {
            int[] node = pq.poll();
            
            if
            (
                node[1] == n - 1
            )
            {
                return node[0];
            }
            else if
            (
                !map.containsKey( node[1] )
            )
            {
                continue;
            }

            
            for
            (
                int[] next
                : map.get( node[1] )
            )
            {
                
                if
                (
                    node[0] <= next[3]
                )
                {
                    pq.offer
                    (
                        new int[]
                        {
                            Math.max( node[0], next[2] ) + 1
                            , next[1]
                        }
                    );
                }
                
            }


            map.remove( node[1] );
        }


        return -1;
    }
    
}

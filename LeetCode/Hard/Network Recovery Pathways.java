class Solution
{
    
    public
    int
    findMaxPathScore
    (
        int[][] edges
        , boolean[] online
        , long k
    )
    {
        int n = online.length - 1;
        
        HashMap < Integer, ArrayList < int[] > > map =
            new HashMap <> ();
        
        PriorityQueue < long[] > pq = new PriorityQueue <>
        (
            ( x, y )
            ->
            Long.compare( y[2], x[2] )
        );
        
        pq.offer( new long[]{ 0, 0, Integer.MAX_VALUE } );


        for
        (
            int[] edge
            : edges
        )
        {
            
            if
            (
                !online[edge[0]]
                || !online[edge[1]]
                || edge[2] > k
            )
            {
                continue;
            }

            if
            (
                !map.containsKey( edge[0] )
            )
            {
                map.put( edge[0], new ArrayList <> () );
            }

            map.get( edge[0] ).add( new int[] { edge[1], edge[2] } );
        }


        while
        (
            !pq.isEmpty()
        )
        {
            long[] polled = pq.poll();
            int node = ( int ) ( polled[0] );
            long cost = polled[1];
            int min = ( int ) ( polled[2] );
            
            if
            (
                node == n
            )
            {
                return min;
            }
            else if
            (
                !map.containsKey( node )
            )
            {
                continue;
            }


            for
            (
                int[] next
                : map.get( node )
            )
            {
                long total = cost + next[1];

                if
                (
                    total > k
                )
                {
                    continue;
                }
                
                int newMin = Math.min( min, next[1] );
                pq.offer( new long[]{ next[0], total, newMin } );
            }

             
        }


        return -1;
    }
    
}

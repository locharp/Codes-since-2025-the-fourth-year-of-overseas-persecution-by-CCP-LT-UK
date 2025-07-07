class Solution
{

    public
    int
    maxEvents
    (
        int[][] events
    )
    {
        PriorityQueue < Integer > pq = new PriorityQueue <> ();
        int n = events.length;
        int ans = 0;
        int i = 0;
        int j = 0;

        Arrays.sort
        (
            events, ( x, y ) ->
            x[0] != y[0] ? x[0] - y[0] : x[1] - y[1]
        );


        while
        (
            j < n
            || !pq.isEmpty()
        )
        {
            

            while
            (
                j < n
                && i == events[j][0]
            )
            {
                pq.offer( events[j][1] );
                j ++;
            }

            
            if
            (
                !pq.isEmpty()
            )
            {
                pq.poll();
                ans++;
            }
            
            
            while
            (
                !pq.isEmpty()
                && pq.peek() == i
            )
            {
                pq.poll();
            }

            if
            (
                pq.isEmpty()
                && j < n
            )
            {
                i = events[j][0];
            }
            else
            {
                i ++;
            }

        }


        return ans;
    }

}

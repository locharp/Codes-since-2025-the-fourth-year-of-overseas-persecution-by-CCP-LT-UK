class Solution
{
    
    public
    long
    maximumScore
    (
        int [] nums
        , String s
    )
    {
        final int n = nums.length;
        long ans = 0;
        
        final Queue < Integer > queue = new PriorityQueue <>
            (
                ( n + 1 ) / 2
                , ( x, y ) -> y.compareTo( x )
            );


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            queue.offer( nums[i] );

            if
            (
                s.charAt( i ) == '1'
            )
            {
                ans += queue.poll();
            }
            
        }


        return ans;
    }
    
}

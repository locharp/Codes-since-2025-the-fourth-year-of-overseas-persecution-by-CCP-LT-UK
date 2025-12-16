class Solution
{

    public
    ArrayList < int [] >
    mergeOverlap
    (
        int [][] arr
    )
    {
        ArrayList < int [] > ans = new ArrayList <> ();
        Arrays.sort( arr, ( x, y ) -> Integer.compare( x[0], y[0] ) );
        int start = arr[0][0];
        int end = arr[0][1];
        
        
        for
        (
            int [] interval
            : arr
        )
        {
            
            if
            (
                interval[0] <= end
            )
            {
                end = Math.max( end, interval[1] );
            }
            else
            {
                ans.add( new int [] { start, end } );
                start = interval[0];
                end = interval[1];
            }
            
        }
        
        
        ans.add( new int [] { start, end } );
        
        
        return ans;
    }
    
}

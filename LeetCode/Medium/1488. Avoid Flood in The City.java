class Solution
{
    
    public
    int[]
    avoidFlood
    (
        int[] rain
    )
    {
        int n = rain.length;
        HashMap < Integer, Integer > hashMap = new HashMap <> ();
        TreeSet < Integer > treeSet = new TreeSet <> ();
        int[] ans = new int[n];
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
        
            if
            (
                rain[i] > 0
            )
            {
                ans[i] = -1;
                
                if
                (
                    hashMap.containsKey( rain[i] )
                )
                {
                    Integer j = hashMap.get( rain[i] );
                    Integer k = treeSet.higher( j );
                    
                    if
                    (
                        k == null
                    )
                    {
                        return new int[0];
                    }
                    
                    treeSet.remove( k );
                    ans[k] = rain[i];
                }
                
                hashMap.put( rain[i], i );
            }
            else
            {
                treeSet.add( i );
            }
            
        }
        
        
        for
        (
            int i
            : treeSet
        )
        {
            ans[i] = 1;
        }
        
        
        return ans;
    }
    
}

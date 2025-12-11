class Solution
{
    
    public
    int
    countGoodTriplets
    (
        int[] arr
        , int a
        , int b
        , int c
    )
    {
        int n = arr.length;
        int ans = 0;
        TreeMap < Integer, Integer > [] treeMaps = new TreeMap [n];
        TreeMap < Integer, Integer > treeMap = new TreeMap <> ();
        treeMap.put( arr[0], 1 );
        
        
        for
        (
            int k = 1
            ; k < n
            ; k++
        )
        {
            int num = arr[k];
            
            NavigableMap < Integer, Integer > mapK
            = getMapOfRange( treeMap, num - a, num + a );
            
            if
            (
                mapK != null
            )
            {
                treeMaps[k] = new TreeMap <> ( mapK );
            }
            
            
            for
            (
                int j = 0
                ; j < k
                ; j ++
            )
            {
                
                if
                (
                    treeMaps[j] == null
                    || Math.abs( num - arr[j] ) > b
                )
                {
                    continue;
                }
                
                NavigableMap < Integer, Integer > map
                = getMapOfRange( treeMaps[j], num - c, num + c );
                
                if
                (
                    map == null
                )
                {
                    continue;
                }
                
                
                for
                (
                    int i
                    : map.values()
                )
                {
                    ans += i;
                }
                
                
            }
            
            
            treeMap.put( num, treeMap.getOrDefault( num, 0 ) );
        }
        
        
        return ans;
    }
    
    
    
    
    NavigableMap < Integer, Integer >
    getMapOfRange
    (
        TreeMap < Integer, Integer > treeMap
        , int start
        , int end
    )
    {
        
        if
        (
            start > treeMap.lastKey()
            || end < treeMap.firstKey()
        )
        {
            return null;
        }
        
        NavigableMap < Integer, Integer > headMap
        = treeMap.headMap
        (
            Math.min
            (
                treeMap.lastKey()
                , end
            )
            
            , true
        );
        
        if
        (
            headMap.isEmpty()
        )
        {
            return null;
        }
        
        NavigableMap < Integer, Integer > resultMap
        = headMap.tailMap
        (
            Math.max
            (
                headMap.firstKey()
                , start
            )
            
            , true
        );
        
        if
        (
            resultMap.isEmpty()
        )
        {
            return null;
        }
        
        return resultMap;
    }
    
}

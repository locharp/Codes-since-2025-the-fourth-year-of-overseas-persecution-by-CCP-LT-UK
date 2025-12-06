class Solution
{
    private static TreeSet < Integer > treeSet;;
    
    
    
    
    Solution
    ()
    {
        
        if
        (
            treeSet == null
        )
        {
            treeSet = new TreeSet <> ();
            
            
            for
            (
                int i = 0
                ; i <= 5000
                ; i ++
            )
            {
                
                
                while
                (
                    !isPalindrome( i )
                )
                {
                    i ++;
                }
                
                
            }
            
            
        }
        
    }
    
    
    
    
    int []
    minOperations
    (
        int [] nums
    )
    {
        return Arrays.stream( nums ).map( this::countOperationsToPalindrome ).toArray();
    }
    
    
    
    
    private
    int
    countOperationsToPalindrome
    (
        int num
    )
    {   
        int higher = treeSet.higher( num );
        int floor = treeSet.floor( num );
        
        
        return Math.min( higher - num, num - floor );
    }
    
    
    
    
    private
    boolean
    isPalindrome
    (
        int num
    )
    {
        int i = 31 - Integer.numberOfLeadingZeros( num );
        int j = 0;
        
        
        while
        (
            i > j
        )
        {
            
            if
            (
                ( ( num >> i ) & 1 ) != ( ( num >> j ) & 1 )
            )
            {   
                return false;
            }
            
            i --;
            j ++;
        }
        
        
        treeSet.add( num );
        return true;
    }
    
}

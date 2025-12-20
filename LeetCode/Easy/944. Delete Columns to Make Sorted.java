class Solution
{
    
    public
    int
    minDeletionSize
    (
        String [] strs
    )
    {
        final int n = strs.length;
        final int m = strs[0].length();
        int ans = 0;
        
        
        for
        (
            int i = 0
            ; i < m
            ; i ++
        )
        {
            boolean t = false;
            
            for
            (
                int j = 1
                ; j < n
                    && !t
                ; j ++
            )
            {
                
                if
                (
                    strs[j].charAt( i ) < strs[j - 1].charAt( i )
                )
                {
                    t = true;
                }
                
            }
            
            
            if
            (
                t
            )
            {
                ans ++;
            }
            
        }
        
        
        return ans;
    }
    
}

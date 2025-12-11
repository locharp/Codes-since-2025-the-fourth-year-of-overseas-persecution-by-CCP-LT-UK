class Solution
{
    
    public
    boolean
    kLengthApart
    (
        int[] nums
        , int k
    )
    {
        int j = k;
        
        
        for
        (
            int num
            : nums
        )
        {
            
            if
            (
                num < 1
            )
            {
                j ++;
            }
            else
            {
                
                if
                (
                    j < k
                )
                {
                    return false;
                }
                
                j = 0;
            }
            
        }
        
        
        return true;
    }
    
}

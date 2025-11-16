class Solution
{
    
    public
    int
    numSub
    (
        String s
    )
    {
        int ans = 0;
        int ones = 0;
        
        
        for
        (
            char ch
            : s.toCharArray()
        )
        {
            
            if
            (
                ch == '0'
            )
            {
                ones = 0;
            }
            else
            {
                ones ++;
                ans = ( ans + ones ) % 1000000007;
            }
            
        }
        
        
        return ans;
    }
    
}

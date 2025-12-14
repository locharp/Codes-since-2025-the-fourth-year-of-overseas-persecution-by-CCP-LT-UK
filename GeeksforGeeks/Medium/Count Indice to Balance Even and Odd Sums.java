class Solution
{
    
    public
    int
    cntWays
    (
        int [] arr
    )
    {
        int n = arr.length;
        int ans = 0;
        int odd = 0;
        int even = 0;
        int o = 0;
        int e = 0;
        boolean t = true;
        
        
        for
        (
            int num
            : arr
        )
        {
            
            if
            (
                t
            )
            {
                even += num;
            }
            else
            {
                odd += num;
            }
            
            t = !t;
        }
        
        
        t = true;
        
        
        for
        (
            int num
            : arr
        )
        {
            
            if
            (
                t
            )
            {
                even -= num;
                
                if
                (
                    odd + e == even + o
                )
                {
                    ans ++;
                }
                
                e += num;
            }
            else
            {
                odd -= num;
                
                if
                (
                    odd + e == even + o
                )
                {
                    ans ++;
                }
                
                o += num;
            }
            
            t = !t;
        }
        
        
        return ans;
    }
    
}

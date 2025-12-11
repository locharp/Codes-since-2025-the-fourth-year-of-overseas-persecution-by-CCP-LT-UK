class Solution
{
    
    public
    int
    maxSumDivThree
    (
        int[] nums
    )
    {
        int sum = 0;
        int one1 = 10001;
        int one2 = 10001;
        int two1 = 10001;
        int two2 = 10001;
        
        
        for
        (
            int num
            : nums
        )
        {
            int m = num % 3;
            sum += num;
            
            if
            (
                m > 1
            )
            {
                
                if
                (
                    num < two1
                )
                {
                    two2 = two1;
                    two1 = num;
                }
                else if
                (
                    num < two2
                )
                {
                    two2 = num;
                }
                
            }
            else if
            (
                m > 0
            )
            {
                
                if
                (
                    num < one1
                )
                {
                    one2 = one1;
                    one1 = num;
                }
                else if
                (
                    num < one2
                )
                {
                    one2 = num;
                }
                
            }
            
        }
        
        
        int m = sum % 3;
        
        if
        (
            m < 1
        )
        {
            return sum;
        }
        
        int o = sum;
        
        if
        (
            m > 1
        )
        {
            
            if
            (
                one2 < 10001
            )
            {
                o = one1 + one2;
            }
            
            if
            (
                two1 < 10001
            )
            {
                o = Math.min( o, two1 );
            }
            
        }
        else
        {
            
            if
            (
                two2 < 10001
            )
            {
                o = two1 + two2;
            }
            
            if
            (
                one1 < 10001
            )
            {
                o = Math.min( o, one1 );
            }
            
        }
        
        
        return sum - o;
    }
    
}

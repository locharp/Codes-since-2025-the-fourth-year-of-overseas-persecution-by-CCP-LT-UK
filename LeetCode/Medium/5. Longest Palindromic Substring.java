class Solution
{
    
    public
    String
    longestPalindrome
    (
        String s
    )
    {
        int n = s.length();
        char [] array = s.toCharArray();
        int ans1 = 0;
        int ans2 = 0;
        int i = 0;
        int j = 1;
        
        
        while
        (
            j < n
        )
        {
            
            if
            (
                isPalindrome( array, i, j )
            )
            {
                ans1 = i;
                ans2 = j;
                i --;
                j ++;
                
                
                while
                (
                    i >= 0
                    && j < n
                    && array[i] == array[j]
                )
                {
                    ans1 = i;
                    ans2 = j;
                    i --;
                    j ++;
                }
                
                
            }
            
            i ++;
            j ++;
        }
        
        
        j -= i + 1;
        i = 0;
        
        
        while
        (
            j < n
        )
        {
            
            if
            (
                isPalindrome( array, i, j 
                        )
            )
            {
                
                ans1 = i;
                ans2 = j;
                i --;
                j ++;
                
                
                while
                (
                    i >= 0
                    && j < n
                    && array[i] == array[j]
                )
                {
                    ans1 = i;
                    ans2 = j;
                    i --;
                    j ++;
                }
                
                
            }
            
            i ++;
            j ++;
        }
        
        
        return s.substring( ans1, ans2 + 1 );
    }
    
    
    
    
    boolean
    isPalindrome
    (
        char [] array
        , int i
        , int j
    )
    {
        
        
        while
        (
            i < j
        )
        {
            
            if
            (
                array[i] != array[j]
            )
            {
                return false;
            }
            
            i ++;
            j --;
        }
        
        
        return true;
    }
    
}

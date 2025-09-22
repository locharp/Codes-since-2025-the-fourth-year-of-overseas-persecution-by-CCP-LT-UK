import java.util.*;





class Solution
{
    
    public
    int
    maxFrequencyElements
    (
        int[] nums
    )
    {
        HashMap < Integer, Integer > numMap = new HashMap <> ();
        int answer = 0;
        int max = 0;
        
        
        for
        (
            int num
            : nums
        )
        {
            numMap.put( num, numMap.getOrDefault( num, 0 ) + 1 );
        }
        
        
        for
        (
            int frequency 
            : numMap.values()
        )
        {
            
            if
            (
                frequency  > max
            )
            {
                max = frequency ;
                answer = frequency ;
            }
            else if
            (
                frequency  == max
            )
            {
                answer += frequency ;
            }
            
        }
        
        
        return answer;
    }
    
}

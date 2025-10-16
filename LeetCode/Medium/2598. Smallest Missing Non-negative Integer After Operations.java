class Solution
{
    
    public
    int
    findSmallestInteger
    (
        int[] nums
        , int value
    )
    {
        int[] arr = new int[value];
        
        for
        (
            int num
            : nums
        )
        {
            num %= value;
            
            if
            (
                num < 0
            )
            {
                num += value;
            }
            
            arr[num] ++;
        }
        
        
        int i = 0;
        
        
        for
        (
            int j = 1
            ; j < value
            ; j ++
        )
        {
            
            if
            (
                arr[i] > arr[j]
            )
            {
                i = j;
            }
            
        }
        
        
        return ( arr[i] * value ) + i;
    }
    
}

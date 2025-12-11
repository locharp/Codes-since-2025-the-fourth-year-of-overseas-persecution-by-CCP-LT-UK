class Solution
{
    
    public
    int
    pivotIndex
    (
        int [] nums
    )
    {
        int n = nums.length;
        int ans = -1;
        int num1 = 0;
        int num2 = Arrays.stream( nums ).sum();
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            num2 -= nums[i];
            
            if
            (
                num1 == num2
            )
            {
                ans = i;
                
                break;
            }
            
            num1 += nums[i];
        }
        
        
        return ans;
    }
    
}

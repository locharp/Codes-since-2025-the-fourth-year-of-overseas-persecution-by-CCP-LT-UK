// 40 ms, 56.92 MB
class Solution
{
    
    public
    long
    perfectPairs
    (
        int[] nums
    )
    {
        int n = nums.length;
        long ans = 0;


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            nums[i] = Math.abs( nums[i] );
        }


        Arrays.sort( nums );
        int i = 0;


        for
        (
            int j = 0
            ; j < n
            ; j ++
        )
        {
            
            
            while
            (
                nums[i] * 2 < nums[j]
            )
            {
                i ++;
            }


            ans += j - i;
        }


        return ans;
    }
    
}





// 91 ms, 57.5 MB
class Solution
{
    
    public
    long
    perfectPairs
    (
        int[] nums
    )
    {
        int n = nums.length;
        long ans = 0;


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            nums[i] = Math.abs( nums[i] );
        }


        Arrays.sort( nums );


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            ans += bs( nums, i ) - i - 1;
        }


        return ans;
    }





    int
    bs
    (
        int[] nums
        , int i
    )
    {
        int n = nums[i] * 2;
        int j = nums.length;


        while
        (
            i < j
        )
        {
            int k = ( i + j ) / 2;

            if
            (
                nums[k] <= n
            )
            {
                i = k + 1;
            }
            else
            {
                j = k; 
            }
            
        }


        return i;
    }

}
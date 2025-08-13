class Solution
{
    
    public
    long
    splitArray
    (
        int[] nums
    )
    {
        int n = nums.length;

        if
        (
            n < 2
        )
        {
            return nums[0];
        }
        
        int[] arr = new int[n];
        long p = 0;
        long q = nums[0] + nums[1];


        for
        (
            int i = 2
            ; i < n
            ; i ++
        )
        {

            if
            (
                arr[i] == 0
            )
            {
                p += nums[i];
            }
            else
            {
                q += nums[i];

                continue;
            }


            for
            (
                int j = i * 2
                ; j < n
                ; j += i
            )
            {
                arr[j] = i;
            }
                
        }


        return Math.abs( p - q );
    }
    
}

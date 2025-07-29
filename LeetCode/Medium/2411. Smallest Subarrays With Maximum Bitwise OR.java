class Solution
{

    public
    int[]
    smallestSubarrays
    (
        int[] nums
    )
    {
        int n = nums.length;
        int[] arr = new int[31];
        int[] ans = new int[n];


        for
        (
            int i = n - 1
            ; i >= 0
            ; i --
        )
        {
            int j = i;


            for
            (
                int k = 0
                ; k < 31
                ; k ++
            )
            {

                if
                (
                    ( nums[i] & ( 1 << k ) ) > 0
                )
                {
                    arr[k] = i;
                }
                else
                {
                    j = Math.max( j, arr[k] );
                }

            }


            ans[i] = j - i + 1;
        }


        return ans;
    }

}

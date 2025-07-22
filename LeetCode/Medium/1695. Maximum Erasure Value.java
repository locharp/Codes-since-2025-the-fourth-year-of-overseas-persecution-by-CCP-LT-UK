class Solution
{

    public
    int
    maximumUniqueSubarray
    (
        int[] nums
    )
    {
        HashMap < Integer, Integer > map = new HashMap <> ();
        int sum = 0;
        int ans = 0;
        int i = 0;


        for
        (
            int j = 0
            ; j < nums.length
            ; j++
        )
        {
            map.put( nums[j], map.getOrDefault( nums[j], 0 ) + 1 );
            sum += nums[j];

            
            while
            (
                map.get( nums[j] ) > 1
            )
            {
                sum -= nums[i];
                map.put( nums[i], map.get( nums[i] ) - 1 );
                i ++;
            }


            ans = Math.max( ans, sum );
        }


        return ans;
    }

}

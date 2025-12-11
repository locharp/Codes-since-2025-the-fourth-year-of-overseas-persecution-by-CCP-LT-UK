class Solution
{
    
    public
    int
    minMirrorPairDistance
    (
        int[] nums
    )
    {
        int n = nums.length;
        HashMap < Integer, Integer > hashMap = new HashMap <> ();
        int ans = n;


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {

            if
            (
                hashMap.containsKey( nums[i] )
            )
            {
                ans = Math.min( ans, i - hashMap.get( nums[i] ) );
            }

            hashMap.put( getMirror ( nums[i] ), i );
        }


        if
        (
            ans == n
        )
        {
            return -1;
        }
        else
        {
            return ans;
        }
    
    }
    



    int
    getMirror
    (
        int num
    )
    {
        int mirror = 0;


        while
        (
            num > 0
        )
        {
            mirror = ( mirror * 10 ) + ( num % 10 );
            num /= 10;
        }


        return mirror;
   }
    
}

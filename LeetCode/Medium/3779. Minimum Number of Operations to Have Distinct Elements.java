class Solution
{
    
    public
    int
    minOperations
    (
        int [] nums
    )
    {

        if
        (
            nums.length == 1
        )
        {
            return 0;
        }
        
        final HashSet < Integer > hashSet = new HashSet <> ();


        for
        (
            int i = nums.length - 1
            ; i >= 0
            ; i --
        )
        {

            if
            (
                hashSet.contains( nums[i] )
            )
            {
                return i / 3 + 1;
            }

            hashSet.add( nums[i] );
        }


        return 0;
    }
    
}

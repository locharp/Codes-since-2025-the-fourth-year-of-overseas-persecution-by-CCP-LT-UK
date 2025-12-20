class Solution
{
    
    public
    int
    maximumSum
    (
        int [] nums
    )
    {
        Arrays.sort( nums );
        final List < Integer > list1 = new ArrayList <> ();
        final List < Integer > list2 = new ArrayList <> ();
        final List < Integer > list3 = new ArrayList <> ();
        int ans = 0;


        for
        (
            int i = nums.length - 1
            ; i >= 0
                &&
                (
                    list1.size() < 3
                    || list2.size() < 3
                    || list3.size() < 3
                )
            ; i --
        )
        {
            int r = nums[i] % 3;

            if
            (
                r == 0
                && list3.size() < 3
            )
            {
                list3.add( nums[i] );
            }
            else if
            (
                r == 1
                && list1.size() < 3
            )
            {
                list1.add( nums[i] );
            }
            else if
            (
                r == 2
                && list2.size() < 3
            )
            {
                list2.add( nums[i] );
            }
            
        }


        if
        (
            list1.size() == 3
        )
        {
            ans = Math.max
            (
                ans
                ,
                list1.subList( 0, 3 )
                .stream()
                .mapToInt( Integer::intValue )
                .sum()
            );
        }
        
        if
        (
            list2.size() == 3
        )
        {
            ans = Math.max
            (
                ans
                ,
                list2.subList( 0, 3 )
                .stream()
                .mapToInt( Integer::intValue )
                .sum()
            );
        }
        
        if
        (
            list3.size() == 3
        )
        {
            ans = Math.max
            (
                ans
                ,
                list3.subList( 0, 3 )
                .stream()
                .mapToInt( Integer::intValue )
                .sum()
            );
        }
        
        if
        (
            !list1.isEmpty()
            && !list2.isEmpty()
            && !list3.isEmpty()
        )
        {
            ans = Math.max
            (
                ans
                ,
                list1.getFirst()
                + list2.getFirst()
                + list3.getFirst()
            );
        }


        return ans;
    }
    
}

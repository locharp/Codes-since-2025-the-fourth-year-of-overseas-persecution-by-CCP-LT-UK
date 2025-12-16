class Solution
{

    public
    int
    findMin
    (
        int [] nums
    )
    {
        int i = 0;
        int j = nums.length - 1;

        if
        (
            nums[0] < nums[j]
        )
        {
            return nums[0];
        }


        while
        (
            i < j
        )
        {
            int k = ( i + j ) / 2;

            if
            (
                nums[k] > nums[k + 1]
            )
            {
                return nums[k + 1];
            }
            else if
            (
                nums[k] < nums[0]
            )
            {
                j = k;
            }
            else
            {
                i = k;
            }

        }


        return nums[i];
    }

}

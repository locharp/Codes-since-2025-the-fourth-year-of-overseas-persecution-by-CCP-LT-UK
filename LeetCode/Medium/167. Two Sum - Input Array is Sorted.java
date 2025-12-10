167. Two Sum II - Input Array Is Sorted
class Solution
{

    public
    int []
    twoSum
    (
        int [] numbers
        , int target
    )
    {
        int i = 0;
        int j = numbers.length - 1;
        

        while
        (
            i < j
        )
        {
            int k = numbers[i] + numbers[j];

            if
            (
                k < target
            )
            {
                i ++;
            }
            else if
            (
                k > target
            )
            {
                j --;
            }
            else
            {
                break;
            }

        }


        return new int [] { i + 1, j + 1 };
    }

}

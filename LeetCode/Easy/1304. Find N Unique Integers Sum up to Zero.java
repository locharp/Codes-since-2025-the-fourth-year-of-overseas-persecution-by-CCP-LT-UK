// 0 ms, 42 MB
class Solution
{

    public
    int[]
    sumZero
    (
        int n
    )
    {
        int[] ans = new int[n];


        for
        (
            int i = 1
            ; i < n
            ; i ++
        )
        {
            ans[i] = i;
            ans[0] -= i;
        }


        return ans;
    }

}

class Solution
{

    public
    int
    totalFruit
    (
        int[] fruits
    )
    {
        int f = -1;
        int f1 = -1;
        int f2 = -1;
        int i = 0;
        int j = 0;
        int k = 0;
        int n = fruits.length;
        int ans = 0;


        while
        (
            k < n
        )
        {

            if
            (
                fruits[k] != f1
                && fruits[k] != f2
            )
            {
                ans = Math.max( ans, k - i );
                f1 = fruits[j];
                f2 = fruits[k];
                i = j;
            }

            f = fruits[k];
            j = k;


            while
            (
                k < n
                && fruits[k] == f
            )
            {
                k ++;
            }


        }


        return Math.max( ans, k - i );
    }

}

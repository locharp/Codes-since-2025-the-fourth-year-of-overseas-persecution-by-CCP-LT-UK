class Solution
{

    public
    int
    maximumGain
    (
        String s
        , int x
        , int y
    )
    {
        char a = 'a';
        char b = 'b';
        int as = 0;
        int bs = 0;
        int ans = 0;

        if
        (
            y > x
        )
        {
            int t = x;
            x = y;
            y = t;
            a = 'b';
            b = 'a';
        }
        
        
        for
        (
            char c
            : s.toCharArray()
        )
        {

            if
            (
                c == a
            )
            {
                as ++;
            }
            else if
            (
                c == b
            )
            {

                if
                (
                    as > 0
                )
                {
                    as --;
                    ans += x;
                }
                else
                {
                    bs ++;
                }

            }
            else
            {
                ans += Math.min( as, bs ) * y;
                as = 0;
                bs = 0;
            }

        }


        return ans + ( Math.min( as, bs ) * y );
    }

}

class Solution
{

    public
    int
    maxOperations
    (
        String s
    )
    {
        int ans = 0;
        int ones = 0;
        int n = s.length();
        int i = 0;


        while
        (
            i < n
        )
        {


            
            if
            (
                s.charAt( i ) == '0'
            )
            {
                ans += ones;
                i ++;


                while
                (
                    i < n
                    && s.charAt( i ) == '0'
                )
                {
                    i ++;
                }


            }
            else
            {
                ones ++;
                i ++;
            }

        }


        return ans;
    }
  
}

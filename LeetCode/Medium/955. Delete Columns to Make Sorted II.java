class Solution
{

    public
    int
    minDeletionSize
    (
        String [] strs
    )
    {
        final int m = strs[0].length();
        final int n = strs.length;
        final boolean [] arr = new boolean [ n ];
        int answer = 0;
        
        
        for
        (
            int i = 0
                , o = 1
            ; i < m
                && o < n
            ; i ++
        )
        {
            int j = o;
            final boolean [] ok = new boolean [ n ];


            while
            (
                j < n
            )
            {
                 
                if
                (
                    !arr[j]
                )
                {
                    
                    if
                    (
                        strs[j].charAt( i ) > strs[j - 1].charAt( i )
                    )
                    {
                         ok[j] = true;
                    }
                    else if
                    (
                        strs[j].charAt( i ) < strs[j - 1].charAt( i )
                    )
                    {
                        answer ++;

                        break;
                    }

                }

                j ++;
            }

            if
            (
                j != n
            )
            {
                continue;
            }


            int k = o;


            while
            (
                k < n
                && ok[k] 
            )
            {
                arr[k] = true;

                k ++;
            }
            

            o = k;


            while
            (
                k < n
            )
            {
                arr[k] |= ok[k];

                k ++;
            }


        }


        return answer;
    }

}

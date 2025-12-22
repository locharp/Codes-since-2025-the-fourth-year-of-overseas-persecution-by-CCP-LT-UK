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
        final int [] arr = new int [ m ];
        int answer = 0;


        for
        (
            int i = 0
            ; i < m
            ; i ++
        )
        {
            
            
            for
            (
                int j = 0
                ; j < i
                ; j ++
            )
            {
                
                if
                (
                    arr[j] <= arr[i]
                )
                {
                    continue;
                }
                
                int k = 0;
                
                
                while
                (
                    k < n
                )
                {
                    
                    if
                    (
                        strs[k].charAt( i ) < strs[k].charAt( j )
                    )
                    {
                        break;
                    }
                    
                    k ++;
                }
                
                
                if
                (
                    k == n
                )
                {
                    arr[i] = arr[j];
                }

            }
            
            
            arr[i] ++;
        }
        
        
        for
        (
            int i
            : arr
        )
        {
            answer = Math.max( answer, i );
        }


        return m - answer;
    }

}

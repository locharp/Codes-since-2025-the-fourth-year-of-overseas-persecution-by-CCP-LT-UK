// 6 ms, 46 MB
class Solution
{

    public
    int
    numSubmat
    (
        int[][] mat
    )
    {
        int ans = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[n];
        
        
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
                ; j < n
                ; j ++
            )
            {

                if
                (
                    mat[i][j] > 0
                )
                {
                    arr[j] ++;


                    for
                    (
                        int k = j
                            , o = arr[j]
                        ; k >= 0
                            && arr[k] > 0
                        ; k --
                    )
                    {
                        o = Math.min( o, arr[k] );
                        ans += o;
                    }
                    

                }
                else
                {
                    arr[j] = 0;
                }
                
            }

            
        }


        return ans;
    }

}

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
        int k = 0;
        int o = 0;
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
                    k = j;
                    o = arr[j];


                    while
                    (
                        k >= 0
                        && arr[k] > 0
                    )
                    {
                        o = Math.min( o, arr[k] );
                        ans += o;
                        k --;
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

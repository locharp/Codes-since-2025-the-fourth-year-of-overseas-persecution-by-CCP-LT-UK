// 1 ms, 47.5 MB
class Solution
{

    public
    int[]
    findDiagonalOrder
    (
        int[][] mat
    )
    {
        int m = mat.length;

        if
        (
            m < 2
        )
        {
            return mat[0];
        }

        int n = mat[0].length;
        int o = n - m;
        int p = m - 1;
        int q = n - 1;
        int k = 0;
        boolean t = true;
        int[] ans = new int[m * n];

        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {

            if
            (
                t
            )
            {
                k = up( mat, ans, Math.min( p, i ), Math.max( 0, i - p ), k );
                t = false;
            }
            else
            {
                k = down( mat, ans, 0, i, k );
                t = true;
            }

        }


        for
        (
            int i = 1
            ; i < m
            ; i ++
        )
        {
            
            if
            (
                t
            )
            {
                k = up( mat, ans, Math.min( p, i + q ), Math.max( 0, i + o ), k );
                t = false;
            }
            else
            {
                k = down( mat, ans, i, q, k );
                t = true;
            }


        }


        return ans;
    }





    int
    up
    (
        int[][] mat
        , int[] ans
        , int i
        , int j
        , int k
    )
    {

        
        while
        (
            i >= 0
            && j < mat[0].length
        )
        {
            ans[k] = mat[i][j];
            i --;
            j ++;
            k ++;
        }


        return k;
    }





    int
    down
    (
        int[][] mat
        , int[] ans
        , int i
        , int j
        , int k
    )
    {

        
        while
        (
            i < mat.length
            && j >= 0
        )
        {
            ans[k] = mat[i][j];
            i ++;
            j --;
            k ++;
        }


        return k;
    }

}






// 1 ms, 47.1 MBs
class Solution
{
    
    public
    int []
    findDiagonalOrder
    (
        int [][] mat
    )
    {
        int [] ans = new int[mat.length * mat[0].length];
        
        up( mat, ans, 0, 0, 0 );
        
        
        return ans;
    }
    
    
    
    
    void
    up
    (
        int [][] mat
        , int [] ans
        , int i
        , int j
        , int k
    )
    {
        
        if
        (
            k == ans.length
        )
        {
            return;
        }
        
        
        while
        (
            i >= 0
            && j < mat[0].length
        )
        {
            ans[k] = mat[i][j];
            
            i --;
            j ++;
            k ++;
        }
        
        
        if
        (
            j == mat[0].length
        )
        {
            i += 2;
            j --;
        }
        else
        {
            i ++;
        }
        
        down( mat, ans, i, j, k );
    }
    
    
    
    
    void
    down
    (
        int [][] mat
        , int [] ans
        , int i
        , int j
        , int k
    )
    {
        
        if
        (
            k == ans.length
        )
        {
            return;
        }
        
        
        while
        (
            i < mat.length
            && j >= 0
        )
        {
            ans[k] = mat[i][j];
            
            i ++;
            j --;
            k ++;
        }
        
        if
        (
            i == mat.length
        )
        {
            i --;
            j += 2;
        }
        else
        {
            j ++;
        }
        
        up( mat, ans, i, j, k );
    }
    
}

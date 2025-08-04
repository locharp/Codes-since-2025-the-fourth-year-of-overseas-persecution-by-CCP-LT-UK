class Solution
{

    public
    int
    maxTotalFruits
    (
        int[][] fruits
        , int startPos
        , int k
    )
    {
        int n = bs( fruits, startPos + k );
        int o = bs( fruits, startPos );
        int i = bs( fruits, startPos - k );
        int j = i;
        int sum = 0;
        
        if
        (
            n < fruits.length
            && fruits[n][0] - startPos <= k
        )
        {
            n ++;
        }


        while
        (
            j < o
        )
        {
            sum += fruits[j][1];
            j ++;
        }


        int ans = sum;
        

        while
        (
            j < n
        )
        {
            sum += fruits[j][1];


            while
            (
                i <= o
                && !check( fruits[i][0], fruits[j][0], k, startPos )
            )
            {
                sum -= fruits[i][1];
                i ++;
            }

      
            ans = Math.max( ans, sum );
            j ++;
        }


        return ans;
    }





    int
    bs
    (
        int[][] fruits
        , int p
    )
    {
        int i = 0;
        int j = fruits.length;


        while
        (
            i < j
        )
        {
            int k = ( i + j ) / 2;

            if
            (
                fruits[k][0] < p
            )
            {
                i = k + 1;
            }
            else if
            (
                fruits[k][0] > p
            )
            {
                j = k;
            }
            else
            {
                return k;
            }

        }

        
        return i;
    }



    boolean
    check
    (
        int i
        , int j
        , int k
        , int p
    )
    {
        return Math.min
        (
            Math.max( 0, p - i ) + ( ( j - p ) * 2 )
            , ( Math.max( 0, p - i ) * 2 ) + ( j - p )
        )
        <=
        k;
    }

}

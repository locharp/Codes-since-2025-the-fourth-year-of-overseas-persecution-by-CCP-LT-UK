class Solution
{

    public
    long
    maxProfit
    (
        int [] prices
        , int [] strategy
        , int k
    )
    {
        final int n = prices.length;
        int i = 0;
        int j = k / 2;
        long sum = 0;
        long diff = 0;


        while
        (
            i < j
        )
        {
            sum += prices[i] * strategy[i];
            diff += prices[i] * -strategy[i];

            i ++;
        }


        while
        (
            i < k
        )
        {
            sum += prices[i] * strategy[i];
            diff += prices[i] * ( 1 - strategy[i] );

            i ++;
        }


        long ans = diff;
        i = 0;


        while
        (
            k < n
        )
        {
            sum += prices[k] * strategy[k];
            diff += ( prices[k] * ( 1 - strategy[k] ) ) - prices[j] + ( prices[i] * strategy[i] );
            ans = Math.max( ans, diff );

            i ++;
            j ++;
            k ++;
        }


        ans = Math.max( ans + sum,  sum );


        return ans;
    }

}

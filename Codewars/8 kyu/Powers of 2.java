public class Kata
{
    
    public static
    long[] powersOfTwo
    (
        int n
    )
    {
        long[] ans = new long[n + 1];
        
        
        for
        (
            int i = 0
            ; i <= n
            ; i ++
        )
        {
            ans[i] = ( long ) ( Math.pow( 2, i ) );
        }
        
        
        return ans;
    }
    
}

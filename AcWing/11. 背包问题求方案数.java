import java.util.*;





class Main
{
    
    public static
    void
    main
    (
        String[] args
    )
    {
        Scanner read = new Scanner( System.in );
        int MOD = 1000000007;
        int N = read.nextInt();
        int V = read.nextInt();
        int[] v = new int[N];
        int[] w = new int[N];
        int[] a = new int[V + 1];
        int[] f = new int[V + 1];
        Arrays.fill( f, 1 );
        
        
        for
        (
            int i = 0
            ; i < N
            ; i++
        )
        {
            v[i] = read.nextInt();
            w[i] = read.nextInt();
        }
        
        
        for
        (
            int i = 0
            ; i < N
            ; i++
        )
        {
            
            
            for
            (
                int j = V
                ; j >= v[i]
                ; j--
            )
            {
                int k = j - v[i];
                int u = w[i] + a[k];
                
                if
                (
                    a[j] < u
                )
                {
                    a[j] = u;
                    f[j] = f[k];
                }
                else if ( a[j] == u )
                {
                    f[j] = ( f[j] + f[k] ) % MOD;
                }
                
            }
            
            
        }
        
        
        System.out.println( f[V] );
    }
    
}

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
        int N = read.nextInt();
        int V = read.nextInt();
        int[] v = new int[N];
        int[] w = new int[N];
        int[] s = new int[N];
        int[] a = new int[V + 1];
        
        
        for
        (
            int i = 0
            ; i < N
            ; i++
        )
        {
            v[i] = read.nextInt();
            w[i] = read.nextInt();
            s[i] = read.nextInt();
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
                int k = 1
                ; s[i] > 0
                ; k *= 2
            )
            {
                int r = Math.min( k, s[i] );
                int p = v[i] * r;
                int q = w[i] * r;
                
                
                for
                (
                    int j = V
                    ; j >= p
                    ; j--
                )
                {
                    a[j] = Math.max( a[j], q + a[j - p] );
                }
                
                
                s[i] -= k;
            }
            
            
        }
        
        
        System.out.println( a[V] );
    }
    
}

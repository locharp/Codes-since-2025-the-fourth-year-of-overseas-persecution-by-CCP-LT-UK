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
        int[] a = new int[V + 1];
        
        
        for
        (
            int i = 0
            ; i < N
            ; i++
        )
        {
            int v = read.nextInt();
            int w = read.nextInt();
            int s = read.nextInt();
        
            if
            (
                s < 0
            )
            {
                put( a, V, v, w, 1 );
            }
            else if
            (
                s > 0
            )
            {
                put( a, V, v, w, s );
            }
            else
            {
                put( a, V, v, w );
            }
            
            
        }
        
        
        System.out.println( a[V] );
    }
    
    
    
    
    
    static
    void
    put
    (
        int[] a
        , int V
        , int v
        , int w
        , int s
    )
    {
        
        
        for
        (
            int k = 1
            ; s > 0
            ; k *= 2
        )
        {
            int r = Math.min( k, s );
            int p = v * r;
            int q = w * r;
            
            
            for
            (
                int j = V
                ; j >= p
                ; j--
            )
            {
                a[j] = Math.max( a[j], q + a[j - p] );
            }
            
            
            s -= k;
        }
        
        
    }
    
    
    
    
    
    static
    void
    put
    (
        int[] a
        , int V
        , int v
        , int w
    )
    {
        
        
        for
        (
            int i = v
            ; i <= V
            ; i++
        )
        {
            a[i] = Math.max( a[i], w + a[i - v] );
        }
        
        
    }
    
}

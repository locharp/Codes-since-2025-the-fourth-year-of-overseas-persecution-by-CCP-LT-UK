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
                a[j] = Math.max( a[j], w[i] + a[j - v[i]] );
            }
            
            
        }
        
        
        System.out.println( a[V] );
    }
    
}

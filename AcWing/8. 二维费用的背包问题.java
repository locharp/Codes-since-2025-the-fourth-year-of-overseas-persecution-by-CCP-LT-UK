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
        int M = read.nextInt();
        int[][] a = new int[V + 1][M + 1];
        
        
        for
        (
            int i = 0
            ; i < N
            ; i++
        )
        {
            int v = read.nextInt();
            int m = read.nextInt();
            int w = read.nextInt();
            
            
            for
            (
                int j = V
                ; j >= v
                ; j--
            )
            {
                
                
                for
                (
                    int k = M
                    ; k >= m
                    ; k--
                )
                {
                    a[j][k] = Math.max( a[j][k], w + a[j - v][k - m] );
                }
                
                
            }
            
        }
        
        
        System.out.println( a[V][M] );
    }
    
    
}

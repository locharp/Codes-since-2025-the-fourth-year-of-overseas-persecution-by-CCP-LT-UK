import java.util.*;




public class Solution
{

    public static
    void
    main
    (
        String [] args
    )
    {
        final Scanner read = new Scanner( System.in );
        final int t = read.nextInt();
        
        
        for
        (
            int h = 0
            ; h < t
            ; h ++
        )
        {
            final int n = read.nextInt();
            final int [] a = new int [ n ];
            final int [] d = new int [ n ];
            a[0] = read.nextInt();
            a[1] = read.nextInt();
            int m = Math.abs( a[1] - a[0] );
            d[1] = m;
            int s = m;
            
            
            for
            (
                int i = 2
                ; i < n
                ; i ++
            )
            {
                a[i] = read.nextInt();
                d[i] = Math.abs( a[i] - a[i - 1] );
                s += d[i];
                m = Math.max( m, d[i] + d[i - 1] - Math.abs( a[i] - a[i - 2] )
);
            }
                
            
            System.out.println( s - Math.max( m, d[n - 1] ) );
        }
        
        
        read.close();
    }
    
}

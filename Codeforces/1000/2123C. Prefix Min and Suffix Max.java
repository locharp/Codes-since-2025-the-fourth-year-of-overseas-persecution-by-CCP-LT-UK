import java.util.*;
 
 
 
 
 
public class Solution
{
 
    public static
    void
    main
    (
        String[] args
    )
    {
        Scanner read = new Scanner( System.in );
        int t = read.nextInt();
        
        
        for
        (
            int h = 0
            ; h < t
            ; h ++
        )
        {
            int n = read.nextInt();
            int[] a = new int[n];
            boolean[] b = new boolean[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            StringBuilder s = new StringBuilder();
            
            
            for
            (
                int i = 0
                ; i < n
                ; i ++
            )
            {
                a[i] = read.nextInt();
                min = Math.min( min, a[i] );
                
                if
                (
                    min < a[i]
                )
                {
                    b[i] = true;
                }
                
            }
            
            
            for
            (
                int i = n - 1
                ; i >= 0
                ; i --
            )
            {
                
                if
                (
                    a[i] >= max
                )
                {
                    max = a[i];
                    s.append( '1' );
                }
                
                else if
                (
                    !b[i]
                )
                {
                    s.append( '1' );
                }
                else
                {
                    s.append( '0' );
                }
                
            }
            
            
            System.out.println( s.reverse().toString() );
        }
 
    }
 
}

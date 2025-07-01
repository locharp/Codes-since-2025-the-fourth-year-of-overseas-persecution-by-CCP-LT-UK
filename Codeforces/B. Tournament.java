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
            int j = read.nextInt();
            int k = read.nextInt();
            int m = 0;
            int s = 0;
            int a = 0;
            
            
            for
            (
                int i = 1
                ; i <= n
                ; i ++
            )
            {
                a = read.nextInt();
                
                if
                (
                    a > m
                )
                {
                    m = a;
                }
                
                if
                (
                    i == j
                )
                {
                    s = a;
                }
                
            }
            
            
            if
            (
                s == m
                || k > 1
            )
            {
                System.out.println( "YES" );
            }
            else
            {
                System.out.println( "NO" );
            }
            
        }
        
 
    }
 
}

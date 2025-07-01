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
            int k = read.nextInt();
            char[] s = read.next().toCharArray();
            int one = 0;
            
            
            for
            (
                char c
                : s
            )
            {
                
                if
                (
                    c == '1'
                )
                {
                    one ++;
                }
                
            }
            
            
            if
            (
                one <= k
                || k * 2 < n
            )
            {
                System.out.println( "Alice" );
            }
            else
            {
                System.out.println( "Bob" );
            }
            
        }
        
 
    }
 
}

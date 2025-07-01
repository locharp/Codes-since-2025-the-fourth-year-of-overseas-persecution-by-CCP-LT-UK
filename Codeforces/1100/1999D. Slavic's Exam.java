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
        int T = read.nextInt();
        read.nextLine();
 
 
        for
        (
            int h = 0
            ; h < T
            ; h ++
        )
        {
            String s = read.nextLine();
            String t = read.nextLine();
            int i = 0;
            StringBuilder ans = new StringBuilder();
            
            
            for
            (
                char c
                : s.toCharArray()
            )
            {
                
                if
                (
                    c == '?'
                )
                {
                    
                    if
                    (
                        i < t.length()
                    )
                    {
                        ans.append( t.charAt( i ) );
                        i ++;
                    }
                    else
                    {
                        ans.append( 'a' );
                    }
                    
                }
                else
                {
                    
                    if
                    (
                        i < t.length()
                        && c == t.charAt( i )
                    )
                    {
                        i ++;
                    }
                    
                    ans.append( c );
                }
                
            }
            
            
            if
            (
                i == t.length()
            )
            {
                System.out.println( "YES" );
                System.out.println( ans.toString() );
            }
            else
            {
                System.out.println( "NO" );
            }
            
        }
        
 
    }
 
}

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
            
            if
            (
                read.nextInt() % 4 > 0
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

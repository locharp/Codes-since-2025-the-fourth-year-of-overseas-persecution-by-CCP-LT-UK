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
            HashMap < Integer, Integer > map = new HashMap <> ();
            HashSet < Integer > set = new HashSet <> ();
            int c = 1;
            int m = 0;
            
            
            for
            (
                int i = 0
                ; i < n
                ; i ++
            )
            {
                int a = read.nextInt();
                map.put( a, map.getOrDefault( a, 0 ) + 1 );
            }
            
            
            for
            (
                int i = 0
                ; i <= n
                ; i ++
            )
            {
                
                if
                (
                    map.containsKey( i )
                )
                {
                    set.add( i );
                }
                else
                {
                    m = i + 1;
                    
                    break;
                }
                
            }
            
            
            for
            (
                int i = 0
                ; i <= n
                ; i ++
            )
            {
                HashSet < Integer > set2 = new HashSet <> ();
                
                
                for
                (
                    int j
                    : set
                )
                {
                    
                    if
                    (
                        map.get( j ) > i
                    )
                    {
                        set2.add( j );
                    }
                    else
                    {
                        map.remove( j );
                        c ++;
                    }
                    
                }
                
                
                System.out.print( Math.min( c, Math.min( m, n - i + 1 ) ) + " " );
                set = set2;
            }
            
            
            System.out.println();
        }
        
 
    }
 
}

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
        int[] a = new int[100001];
        sieve( a );
        int t = read.nextInt();
        
        
        for
        (
            int h = 0
            ; h < t
            ; h ++
        )
        {
            int n = read.nextInt();
            int[] ans = new int[n];
            HashMap < Integer, ArrayList < Integer > > map = new HashMap <> ();
            
            
            for
            (
                int i = 1
                ; i <= n
                ; i ++
            )
            {
                
                if
                (
                    a[i] == i
                )
                {
                    map.put( i, new ArrayList <> () );
                    map.get( i ).add( i );
                }
                else
                {
                    int j = i / 2;
                    
                    if
                    (
                        j * 2 == i
                        && a[j] == j
                    )
                    {
                        map.get( j ).add( i );
                    }
                    else
                    {
                        map.get( a[i] ).add( i );
                    }
                    
                }
                
            }
            
            
            for
            (
                ArrayList< Integer > list
                : map.values()
            )
            {
                
                
                for
                (
                    int i = 0;
                    i < list.size();
                    i ++
                )
                {
                    ans[list.get( i ) - 1] = list.get( ( i + 1 ) % list.size() );
                }
                
                
            }
            
            
            for
            (
                int i
                : ans
            )
            {
                System.out.print( i + " " );
            }
            
            
            System.out.println();
        }
        
 
    }
    
    
    
    
    
    static
    void
    sieve
    (
        int[] a
    )
    {
        a[1] = 1;
        
        
        for
        (
            int i = 2
            ; i < a.length
            ; i ++
        )
        {
            
            if
            (
                a[i] > 0
            )
            {
                continue;
            }
            
            
            for
            (
                int j = i
                ; j < a.length
                ; j += i
            )
            {
                a[j] = i;
            }
            
            
        }
        
        
    }
 
}

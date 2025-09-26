public class OddEvenSort
{
       
    public static
    String
    sortMyString
    (
        String s
    )
    {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        
        for
        (
            int i = 0
            ; i < s.length()
            ; i ++
        )
        {
            
            if
            (
                i % 2 > 0
            )
            {
                s1.append( s.charAt( i ) );
            }
            else
            {
                s2.append( s.charAt( i ) );
            }
        
        }
        
        
        return s2 + " " + s1;
    }
    
}

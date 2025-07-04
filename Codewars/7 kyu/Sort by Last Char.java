import java.util.*;





public class Kata
{
    
    public static
    String[]
    last
    (
        String x
    )
    {
        String[] arr = x.split( " " );
        Arrays.sort
        (
            arr
            
            , ( s, t ) ->
                Character.compare
                (
                    s.charAt( s.length() - 1 )
                    , t.charAt( t.length() - 1 )
                )
        );
        
        
        return arr;
    }
}

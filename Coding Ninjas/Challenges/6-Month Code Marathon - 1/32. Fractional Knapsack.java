// Time Limit Exceeded
import java.util.*;

/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
            int weight;
            int value;
            Pair(int weight, int value)
            {
                this.weight = weight;
                this.value = value;
            }
            
        }
        
*****************************************************************/

public class Solution
{

    public static
    double
    maximumValue
    (
        Pair[] items
        , int n
        , int w
    )
    {
        HashMap < Double, Integer > map = new HashMap <> ();
        double ans = 0;


        for
        (
            Pair item
            : items
        )
        {
            double u = ( ( double ) ( item.value ) ) / item.weight;
            map.put( u, map.getOrDefault( u, 0 ) + item.weight );
        }


        ArrayList < Double > list = new ArrayList <> ( map.keySet() );
        list.sort( Comparator.reverseOrder() );


        for
        (
            Double i
            : list
        )
        {
            int u = Math.min( w, map.get( i ) );
            w -= u;
            ans += i * u;


            if
            (
                w < 1
            )
            {
                break;
            }

        }


        return ans;
    }

}

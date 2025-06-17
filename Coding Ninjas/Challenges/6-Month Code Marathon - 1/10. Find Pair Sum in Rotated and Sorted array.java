import java.util.*;





public class Solution 
{

    public static
    boolean
    findPairSum
    (
        int[] arr
        , int target
    ) 
    {
        HashSet< Integer > set = new HashSet<>();


        for
        (
            int num
            : arr
        )
        {

            if
            (
                set.contains( target - num )
            )
            {
                return true;
            }

            set.add( num );
        }


        return false;
    }
    
}

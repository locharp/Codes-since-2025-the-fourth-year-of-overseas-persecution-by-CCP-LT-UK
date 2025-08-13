import java.util.*;




public class Solution
{

    public static
    int
    groupAllOneTogether
    (
        int arr[]
        , int n
    )
    {
        int i = 0;
        int j = 0;
        int o = 0;
        int ans = 0;



        for
        (
            int num
            : arr
        )
        {
            o += num;
        }


        while
        (
            j < o
        )
        {
            ans += arr[j];
            j ++;
        }


        o = ans;


        while
        (
            j < n
        )
        {
            o -= arr[i];
            o += arr[j];
            i ++;
            j ++;
            ans = Math.max( ans, o );
        }


        return ans;
    }

}

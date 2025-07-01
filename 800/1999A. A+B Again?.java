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
            int i = 0
            ; i < t
            ; i ++
        )
        {
            int n = read.nextInt();
            
            System.out.println( ( n / 10 ) + ( n % 10 ) );
        }


    }

}

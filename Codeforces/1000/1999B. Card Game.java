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
            suneet[0] = read.nextInt();
            suneet[1] = read.nextInt();
            slavic[0] = read.nextInt();
            slavic[1] = read.nextInt();
            Arrays.sort( sunnet );
            Arrays.sort( slavic );
            int ans = 0;
            
            if
            (
                suneet[0] > slavic[1]
                ||
                (
                    suneet[0] == slavic[1]
                    && suneet[1] > slavic[1]
                )
            )
            {
                ans = 4;
            }
            else if
            (
            suneet[0] > slavic[0]
            && suneet[1] >= slavic[1]
            )
            {
                ans = 2;
            }
            
            System.out.println( ans );   
        }


    }

}

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
        int[] suneet = new int[2];
        int[] slavic = new int[2];


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
            Arrays.sort( suneet );
            Arrays.sort( slavic );
            
            if
            (
                suneet[0] > slavic[1]
                ||
                (
                    suneet[0] == slavic[1]
                    &&
                    (
                        suneet[0] > slavic[0]
                        || suneet[1] > slavic[1]
                    )
                )
            )
            {
                System.out.println( 4 );
            }
            else if
            (
                (
                    suneet[0] > slavic[0]
                    && suneet[1] >= slavic[1]
                )
                ||
                (
                    suneet[0] == slavic[0]
                    && suneet[1] > slavic[1]
                )
            )
            {
                System.out.println( 2 );
            }
            else
            {
                System.out.println( 0 );
            }
            
        }


    }

}

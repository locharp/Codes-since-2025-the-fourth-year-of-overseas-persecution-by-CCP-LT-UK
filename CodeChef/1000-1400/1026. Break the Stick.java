import java.util.*;




class Codechef
{

    public static
    void
    main(
        String[] args
    )
    {
        Scanner read = new Scanner( System.in );
        int T = read.nextInt();


        for
        (
            int h = 0
            ; h < T
            ; h++
        )
        {
            int N = read.nextInt();
            int X = read.nextInt();


            if (
                (
                    X % 2 < 1
                    &&
                    (
                        N % 2 > 0
                        || X + 2 > N
                    )
                )
                ||
                X + 1 + ( N % 2 ) > N
            )
            {
                System.out.println( "NO" );
            }
            else
            {
                System.out.println( "YES" );
            }
            
        }
        

    }

}

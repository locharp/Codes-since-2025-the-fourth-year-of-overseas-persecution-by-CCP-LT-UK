import java.util.*;




class Codechef
{

    public static
    void
    main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();


        for (int h = 0; h < T; h++)
        {
            int N = read.nextInt();
            int K = read.nextInt();
            int g = 0;
            int ans = 0;



            for (int i = 1; i <= N; i++)
            {
                g += read.nextInt() - K;

                if (
                    ans < 1 &&
                    g < 0
                )
                {
                    ans = i;
                }

            }


            if (
                ans < 1
            )
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO " + ans);
            }

        }


    }

}

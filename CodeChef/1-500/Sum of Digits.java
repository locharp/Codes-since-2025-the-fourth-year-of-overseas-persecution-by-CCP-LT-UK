import java.util.*;




class Codechef
{

    public static
    void
    main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();


        for (int i = 0; i < T; i++)
        {
            int n = read.nextInt();
            int ans = 0;


            while (n > 0)
            {
                ans += n % 10;
                n /= 10;
            }


            System.out.println(ans);
        }


    }

}
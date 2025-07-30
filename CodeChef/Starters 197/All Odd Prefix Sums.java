import java.util.*;




class Codechef
{

    public static
    void
    main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();


        for (int t = 0; t < T; t++)
        {
            int N = read.nextInt();
            int o = 0;


            for (int i = 0; i < N; i++) {

                if (read.nextInt() % 2 > 0) {
                    o++;
                }

            }
            
            
            System.out.println(o == 1 ? "Yes" : "No");
        }


    }

}

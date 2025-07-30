import java.util.*;




class Codechef
{

    public static
    void
    main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();


        for (int t = 0; t < T; t++) {
            int N = read.nextInt();
            int X = read.nextInt();
            int Y = read.nextInt();
            int ans = 0;


            for (int i = 0; i < N; i++) {
                int A = read.nextInt();

                if (A >= X && A <= Y) {
                    ans++;
                }
            }
            
            System.out.println(ans);
        }


    }

}

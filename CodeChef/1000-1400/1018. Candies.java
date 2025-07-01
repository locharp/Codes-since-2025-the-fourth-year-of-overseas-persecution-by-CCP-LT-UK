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
            int N = read.nextInt() * 2;
            HashMap < Integer, Integer > map = new HashMap < > ();
            

            for (int i = 0; i < N; i++)
            {
                int a = read.nextInt();
                map.put(a, map.getOrDefault(a, 0) + 1);
            }


            if (map.values().stream().allMatch(c -> c < 3))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
        }


    }

}

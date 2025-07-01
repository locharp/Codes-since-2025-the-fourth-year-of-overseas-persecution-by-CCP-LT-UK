import java.util.*;




class Codechef
{

    public static
    void
    main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();
        

        for (int i = 0; i < T; i++)
        {
            int N = read.nextInt();
            int a = 0;
            
            
            for (int j = 0; j < N; j++)
            {
                a += read.nextInt();
            }
            
            
            if (a % 2 > 0)
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

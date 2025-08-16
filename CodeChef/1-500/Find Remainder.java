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
            int A = read.nextInt();
            int B = read.nextInt();

            System.out.println(A % B);
        }


    }

}
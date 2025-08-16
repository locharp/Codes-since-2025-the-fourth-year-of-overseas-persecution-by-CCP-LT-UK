import java.util.Scanner;




class Codechef
{
    public static
    void
    main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int ans = 1;


        while (n > 1)
        {
            ans *= n;
            n--;
        }


        System.out.println(ans);
    }

}
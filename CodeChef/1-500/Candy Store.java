import java.util.Scanner;




public class Main
{
    public static
    void
    main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        while (t--> 0)
        {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println((Math.max(0, (y - x)) * 2) + Math.min(x, y));
        }


    }

}
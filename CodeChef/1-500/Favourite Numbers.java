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
            int a = scanner.nextInt();


            if (a % 2 > 0)
            {

                if (a % 9 > 0)
                {
                    System.out.println("Charlie");
                }
                else
                {
                    System.out.println("Bob");
                }

            }
            else
            {

                if (a % 7 > 0)
                {
                    System.out.println("Charlie");
                }
                else
                {
                    System.out.println("Alice");
                }

            }

        }


    }

}
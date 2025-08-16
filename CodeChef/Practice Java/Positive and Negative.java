import java.util.*;




class Codechef
{

    public static
    void
    main(String[] args)
    {
        Scanner read = new Scanner( System.in );
        
        
        for
        (
            int i = 0
            ; i < 3
            ; i ++
        )
        {
            int num = read.nextInt();
            
            if
            (
                num > 0
            )
            {
                System.out.println("Positive");
            }
            else if
            (
                num < 0
            )
            {
                System.out.println("Negative");
            }
            else
            {
                System.out.println("Zero");
            }
            
        }
        
        
    }

}

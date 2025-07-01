import java.util.*;





class Codechef
{
    public static
    void
    main
    (
        String[] args
    ) 
    {
        Scanner read = new Scanner( System.in );
        
        
        for
        (
            int i = 0
            ; i < 3
            ; i ++
        )
        {
            int mark = read.nextInt();
            
            if
            (
                mark > 90
            )
            {
                System.out.println( "A" );
            }
            else if
            (
                mark > 70
            )
            {
                System.out.println( "B" );
            }
            else if
            (
                mark >= 40
            )
            {
                System.out.println( "C" );
            }
            else
            {
                System.out.println( "F" );
            }
            
        }
        
        
    }
    
}

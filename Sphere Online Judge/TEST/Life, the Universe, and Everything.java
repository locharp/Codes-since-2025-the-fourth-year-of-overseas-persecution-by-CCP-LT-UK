import java.util.*;





class Main
{
    
    public static
    void
    main
    (
        String args[]
    )
    {
        Scanner read = new Scanner( System.in );
        int num = read.nextInt();
        
        
        while
        (
            num != 42
        )
        {
            System.out.println( num );
            num = read.nextInt();
        }
        
        
    }
    
}

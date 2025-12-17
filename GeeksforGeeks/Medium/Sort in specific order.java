class Solution
{
    
    public
    void
    sortIt
    (
        int [] arr
    )
    {
        int [] sorted = Arrays.stream( arr )
            .boxed()
            .sorted( new IntSpecialComparator() )
            .mapToInt( Integer::intValue )
            .toArray();
        
        System.arraycopy( sorted, 0, arr, 0, arr.length );
    }
    
    
    
    
    class IntSpecialComparator
    implements Comparator < Integer >
    {
        
        @Override
        public
        int
        compare
        (
            Integer num1
            , Integer num2
        )
        {
            int r = num1 % 2;
            int s = num2 % 2;
            
            
            if
            (
                num1 % 2 != num2 % 2
            )
            {
                
                return Integer.compare( s, r );
            }
            else if
            (
                r == 1
            )
            {
                return Integer.compare( num2, num1 );
            }
            else
            {
                return Integer.compare( num1, num2 );
            }
            
        }
        
    }
    
}

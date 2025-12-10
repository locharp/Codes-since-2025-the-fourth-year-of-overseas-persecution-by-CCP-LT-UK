class Solution
{
    
    public
    String
    reverseWords
    (
        String s
    )
    {
        String [] array = s.trim().split( "\\s+" );
        
        for
        (
            int i = 0
                , j = array.length - 1
            ; i < j
            ; i ++, j --
        )
        {
            String t = array[i];
            array[i] = array[j];
            array[j] = t;
        }
        
        
        return String.join( " ", array );
    }
    
}

class Solution
{
    
    public
    String
    reverseWords
    (
        String s
    )
    {
        return String.join( " ", Arrays.stream( s.split( " " ) )
            .map( ( ss ) -> new StringBuilder( ss ).reverse().toString() )
            .toArray( String []::new )
        );
    }
    
}
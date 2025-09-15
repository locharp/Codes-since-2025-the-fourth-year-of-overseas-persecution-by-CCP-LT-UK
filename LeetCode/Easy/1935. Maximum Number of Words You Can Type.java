// 2ms, 42.1MB
class Solution
{
    
    public
    int
    canBeTypedWords
    (
        String text
        , String brokenLetters
    )
    {
        String[] words = text.split( " " );
        char[] broken = brokenLetters.toCharArray();
        int ans = 0;
        

        for
        (
            String word
            : words
        )
        {
            int i = -1;


            for
            (
                char c
                : broken
            )
            {
                i = word.indexOf( c );

                if
                (
                    i >= 0
                )
                {
                    break;
                }
                
            }
            

            if
            (
                i < 0
            )
            {
                ans ++;
            }
            
        }

        
        return ans;
    }
    
}

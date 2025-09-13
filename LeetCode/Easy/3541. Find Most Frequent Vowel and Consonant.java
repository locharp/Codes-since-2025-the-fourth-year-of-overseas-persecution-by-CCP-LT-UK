class Solution
{
    
    public
    int
    maxFreqSum
    (
        String s
    )
    {
        HashMap < Character, Integer > vowels  =  new HashMap <> ();
        HashMap < Character, Integer  > consonants = new  HashMap <> ();
        int vowelCount = 0;
        int consonantCount = 0;


        for
        (
            char c
            : "aeiou".toCharArray()
        )
        {
            vowels.put( c, 0 );
        }
        
        
        for
        (
            char c
             : s.toCharArray()
        )
        {

            if
            (
                vowels.containsKey( c )
             )
            {
                vowels.put( c, vowels.get( c ) + 1 );
            }
            else
            {
                consonants.put( c, consonants.getOrDefault( c, 0 ) + 1 );
            }
            
        }


        for
        (
            int count
            : vowels.values()
        )
        {

            if
            (
                count > vowelCount 
            )
            {
                vowelCount = count;
            }
            
        }


        for
        (
            int count
            : consonants.values()
        )
        {

            if
            (
                count > consonantCount 
            )
            {
                consonantCount = count;
            }
            
        }


        return vowelCount + consonantCount;
   }
        
}

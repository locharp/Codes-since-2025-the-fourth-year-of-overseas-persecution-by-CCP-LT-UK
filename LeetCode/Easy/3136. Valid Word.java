class Solution
{

    public
    boolean
    isValid
    (
        String word
    )
    {
        
        if
        (
            word.length() < 3
        )
        {
            return false;
        }

        boolean consonant = false;
        boolean vowel = false;


        for
        (
            char c
            : word.toLowerCase().toCharArray()
        )
        {

            if
            (
                !Character.isLetterOrDigit( c )
            )
            {
                return false;
            }

            if
            (
                c >= '0'
                && c <='9'
            )
            {
                continue;
            }
            else if
            (
                c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u'
            )
            {
                vowel = true;
            }
            else
            {
                consonant = true;
            }

        }


        return consonant && vowel;
    }

}

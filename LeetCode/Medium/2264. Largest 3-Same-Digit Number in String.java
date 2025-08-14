class Solution
{

    public
    String
    largestGoodInteger
    (
        String num
    )
    {
        char c = ' ';
        char d = ' ';
        int n = 0;


        for
        (
            char i
            : num.toCharArray()
        )
        {

            if
            (
                i > d
            )
            {

                if
                (
                    i == c
                )
                {
                    n ++;
                }
                else
                {
                    n = 1;
                }

                if
                (
                    n == 3
                )
                {
                    d = c;
                }

            }

            c = i;
        }


        if
        (
            d == ' '
        )
        {
            return "";
        }
        else
        {
            return Character.toString( d ).repeat( 3 );
        }

    }

}

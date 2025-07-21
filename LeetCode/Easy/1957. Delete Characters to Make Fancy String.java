class Solution
{

    public
    String
    makeFancyString
    (
        String s
    )
    {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        char d = 'A';

        for
        (
            char c
            : s.toCharArray()
        )
        {

            if
            (
                c == d
            )
            {
                count ++;
            }
            else
            {
                d = c;
                count = 1;
            }

            if
            (
                count < 3
            )
            {
                ans.append( c );
            }

        }


        return ans.toString();
    }

}

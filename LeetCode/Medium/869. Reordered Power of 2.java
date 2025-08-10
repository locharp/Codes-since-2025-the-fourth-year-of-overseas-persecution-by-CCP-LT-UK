class Solution
{

    public
    boolean
    reorderedPowerOf2
    (
        int n
    )
    {
        char[] arr1 = Integer.toString( n ).toCharArray();
        Arrays.sort( arr1 );


        for
        (
            int i = 1
            ; i > 0
            ; i *= 2
        )
        {
            char[] arr2 = Integer.toString( i ).toCharArray();

            if
            (
                arr1.length < arr2.length
            )
            {
                break;
            }

            Arrays.sort( arr2 );

            if
            (
                Arrays.equals( arr1, arr2 )
            )
            {
                return true;
            }

        }


        return false;
    }

}

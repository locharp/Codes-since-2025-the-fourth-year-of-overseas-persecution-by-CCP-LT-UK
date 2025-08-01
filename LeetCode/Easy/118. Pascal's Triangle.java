class Solution
{

    public
    List < List < Integer > >
    generate
    (
        int numRows
    )
    {
        ArrayList< List < Integer > > ans = new ArrayList <> ();
        ans.add( new ArrayList <> () );
        ans.get( 0 ).add( 1 );

        for
        (
            int i = 1
            ; i < numRows
            ; i ++
        )
        {
            List < Integer > prev = ans.getLast();
            ArrayList < Integer > list = new ArrayList <> ();
            list.add( 1 );


            for
            (
                int j = 1
                ; j < prev.size()
                ; j ++
            )
            {
                list.add( prev.get( j - 1 ) + prev.get( j ) );
            }


            list.add( 1 );
            ans.add( list );
        }


        return ans;
    }

}

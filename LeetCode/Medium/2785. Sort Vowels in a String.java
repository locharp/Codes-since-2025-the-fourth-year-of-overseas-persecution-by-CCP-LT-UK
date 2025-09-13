class Solution
{
    
    public
    String
    sortVowels
    (
        String s
    )
    {
        int n = s.length();
        ArrayList <  Integer  > list1  = new ArrayList <> ();
        ArrayList < Character > list2 = new ArrayList <> ();
        StringBuilder ans = new StringBuilder( s );


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {

            if
            (
                "AEIOUaeiou".contains( s.substring( i, i + 1 ) )
            )
            {
                list1.add( i );
                list2.add( s.charAt( i ) );
            }
            
        }


        list2.sort( Comparator.naturalOrder() );
        int m = list1.size();


        for
        (
            int  i = 0
            ; i < m
            ; i ++
        )
        {
            ans.setCharAt
            (
                list1.get( i )
                ,  list2.get( i )
            );
        }


        return ans.toString();
    }
}

class Solution
{

    public
    List < String >
    removeSubfolders
    (
        String[] folder
    )
    {
        ArrayList < String > ans = new ArrayList <> ();
        Arrays.sort( folder );
        ans.add( folder[0] );
        
        
        for
        (
            int i = 1
            ; i < folder.length
            ; i ++
        )
        {

            if
            (
                !folder[i].startsWith( ans.getLast() )
                || folder[i].charAt( ans.getLast().length() ) != '/'
            )
            {
                ans.add( folder[i] );
            }

        }


        return ans;
    }

}

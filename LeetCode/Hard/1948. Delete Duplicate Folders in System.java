class Solution
{

    public
    List < List < String > >
    deleteDuplicateFolder
    (
        List < List < String > > paths
    )
    {
        Trie t = new Trie();
        HashMap < String, Integer > map = new HashMap <> ();
        ArrayList< List < String > > remains = new ArrayList <> ();
        ArrayList < String > folder = new ArrayList <> ();


        for
        (
            List < String > path
            : paths
        )
        {
            t.add( path );
        }


        t.serialise( map );
        t.filter( map, remains, folder );


        return remains;
    }

}





class Trie
{
    String serial;
    HashMap < String, Trie > subs;






    Trie
    ()
    {
        subs = new HashMap <> ();
    }





    void
    add
    (
        List < String > path
    )
    {
        Trie t = this;


        for
        (
            int i = 0
            ; i < path.size()
            ; i ++
        )
        {

            if
            (
                !t.subs.containsKey( path.get( i ) )
            )
            {
                t.subs.put( path.get( i ), new Trie() );
            }

            t = t.subs.get( path.get( i ) );
        }


    }





    String
    serialise
    (
        HashMap < String, Integer > map
    )
    {

        if
        (
            subs.isEmpty()
        )
        {
            return "";
        }

        StringBuilder s = new StringBuilder( "(" );
        ArrayList < String > keySet = new ArrayList( subs.keySet() );
        Collections.sort( keySet );

        
        for
        (
            String sub
            : keySet
        )
        {
            s.append( sub + subs.get( sub ).serialise( map ) );
        }


        s.append( ')' );
        serial = s.toString();
        map.put( serial, map.getOrDefault( serial, 0 ) + 1 );


        return serial;
    }





    void
    filter
    (
        HashMap < String, Integer > map
        , ArrayList< List < String > > remains
        , ArrayList < String > folder
    )
    {


        for
        (
            var e
            : subs.entrySet()
        )
        {
            
            if
            (
                e.getValue().serial != null
                && map.get( e.getValue().serial ) > 1//equals( "" )
            )
            {
                continue;
            }

            folder.add( e.getKey() );
            remains.add( new ArrayList <> ( folder ) );
            e.getValue().filter( map, remains, folder );
            folder.removeLast();
        }


    }

}

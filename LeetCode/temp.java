class Solution
{

    public
    int
    possibleStringCount
    (
        String word
        , int k
    )
    {
        ArrayList < Integer > list = getList( word );
        int[] arr = new int[list.size()];
        arr[arr.length - 1] = list.get( arr.length - 1 );
        Hashcache < Integer, Integer > [] cache = new Hashcache[arr.length];
        Arrays.fill( cache, new Hashcache <> () );
        int ans = 0;


        for
        (
            int i = arr.length - 2
            ; i >= 0
            ; i --
        )
        {
            arr[i] = arr[i + 1] + list.get( i );
        }
      

        for
        (
            int i = 0
            ; i < arr.length
            ; i ++
        )
        {
            cache[i] = new Hashcache <> ();
        }



        return solve( list, arr, cache, 0, k );
    }





    int
    solve
    (
        ArrayList < Integer > list
        , int[] arr
        , Hashcache < Integer, Integer > [] cache
        , int i
        , int k
    )
    {

        if
        (
            i == arr.length
            || arr[i] < k
        )
        {
            return 0;
        }

        int m = Math.min( arr[i], k );
        m = Math.max( m, list.size() - i );

        if
        (
            cache[i].containsKey( m )
        )
        {
            return cache[i].get( m );
        }
        else if
        (
            i + 1 == arr.length
        )
        {
            
            if
            (
                k > 0
            )
            {
                return arr[i] - k + 1;
            }
            else
            {
                return arr[i];
            }
            
        }

        cache[i].put( m, 0 );


        for
        (
            int j = 1
            ; j <= list.get( i )
            ; j ++
        )
        {
            cache[i].put( m, cache[i].get( m ) + solve( list, arr, cache, i + 1, m - j )  % 1000000007 );
        }


        return cache[i].get( m );
    }





    ArrayList
    < Integer >
    getList
    (
        String word
    )
    {
        ArrayList< Integer > list = new ArrayList<>();
        char d = ' ';


        for
        (
            char c
            : word.toCharArray()
        )
        {
            
            if
            (
                c == d
            )
            {
                list.set( list.size() - 1, list.getLast() + 1 );
            }
            else
            {
                list.add( 1 );
                d = c;
            }

        }


        return list;
    }
    
}

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
        HashMap < Integer, Integer > [] cache = new HashMap[arr.length];
        Arrays.fill( cache, new HashMap <> () );


        for
        (
            int i = arr.length - 2
            ; i >= 0
            ; i --
        )
        {
            arr[i] = arr[i + 1] + list.get( i );
        }
    
        return solve( list, arr, cache, 0, k );
    }





    Integer
    solve
    (
        ArrayList < Integer > list
        , int[] arr
        , HashMap < Integer, Integer > [] cache
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
        else if
        (
            arr[i] == k
        )
        {
            return 1;
        }

        k = Math.max( k, arr.length - i );

        if
        (
            cache[i].containsKey( k )
        )
        {
            return cache[i].get( k );
        }
        else if
        (
            i + 1 == arr.length
        )
        {
            return arr[i] - k + 1;
        }

        cache[i].put( k, 0 );
        int n = Math.min( list.get( i ), ( arr[i] - k ) + 1 );


        for
        (
            int j = 1
            ; j <= n
            ; j ++
        )
        {
            cache[i].put( k, ( cache[i].get( k ) + solve( list, arr, cache, i + 1, k - j ) ) % 1000000007 );
        }


        return cache[i].get( k );
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

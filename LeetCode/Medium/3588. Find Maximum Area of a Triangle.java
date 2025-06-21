class Solution
{

    public
    long
    maxArea
    (
        int[][] coords
    )
    {
        HashMap< Integer, Co > map1 = new HashMap<>();
        HashMap< Integer, Co > map2 = new HashMap<>();
        

        for
        (
            int[] coord
            : coords
        )
        {
            put( map1, coord[0], coord[1] );
            put( map2, coord[1], coord[0] );
        }


        return Math.max( getMax( map1 ), getMax( map2 ) );
        
    }





    void
    put
    (
        HashMap< Integer, Co > map
        , int x
        , int y
    )
    {

        if
        (
            map.containsKey( x )
        )
        {

            if
            (
                map.get( x ).getX() > y
            )
            {
                map.get( x ).setX( y );
            }
            else if
            (
                map.get( x ).getY() < y
            )
            {
                map.get( x ).setY( y );
            }
            
        }
        else
        {
            map.put( x, new Co( y, y ) );
        }
        
    }





    long
    getMax
    (
        HashMap< Integer, Co > map1
    )
    {
        long max = -1;
        int s = Integer.MAX_VALUE;
        int t = Integer.MIN_VALUE;


        for
        (
            int i
            : map1.keySet()
        )
        {
            s = Math.min( s, i );
            t = Math.max( t, i );
        }

        
        for
        (
            var e
            : map1.entrySet()
        )
        {
            long w = e.getValue().getY() - e.getValue().getX();
            long h = 0;

            if
            (
                w < 1
            )
            {
                continue;
            }

            if
            (
                e.getKey() > s
            )
            {
                h = e.getKey() - s;
            }
            
            if
            (
                e.getKey() < t
            )
            {
                h = Math.max( h, t - e.getKey() );
            }

            if
            (
                h > 0
            )
            {
                max = Math.max( max, h * w );
            }

        }


        return max;
    }
    
}




class Co
{
    int x;
    int y;





    Co
    (
        int x
        , int y
    )
    {
        this.setX( x );
        this.setY( y );
    }





    int
    getX
    ()
    {
        return x;
    }





    void
    setX
    (
        int x
    )
    {
        this.x = x;
    }





    int
    getY
    ()
    {
        return y;
    }





    void
    setY
    (
        int y
    )
    {
        this.y = y;
    }
    
}

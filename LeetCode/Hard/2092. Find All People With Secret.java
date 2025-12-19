class Solution
{

    public
    List < Integer >
    findAllPeople
    (
        int n
        , int [][] meetings
        , int firstPerson
    )
    {
        final boolean [] knew = new boolean [ n ];
        final List < Pair < Integer, Integer > > [] lists = new ArrayList [ n ];
        final List < Integer > ans = new ArrayList <> ();
        final Queue < Pair < Integer, Integer > > queue = new PriorityQueue <>
        (
            ( x, y ) -> Integer.compare( x.getKey(), y.getKey() )
        );
        queue.offer( new Pair <> ( 0, 0 ) );
        queue.offer( new Pair <> ( 0, firstPerson ) );


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            lists[i] = new ArrayList <> ();
        }


        for
        (
            int [] meeting
            : meetings
        )
        {
            lists[meeting[0]].add( new Pair <> ( meeting[2], meeting[1] ) );
            lists[meeting[1]].add( new Pair <> ( meeting[2], meeting[0] ) );
        }
        

        while
        (
            !queue.isEmpty()
        )
        {
            final int time = queue.peek().getKey();
            final int sharer = queue.poll().getValue();

            if
            (
                knew[sharer]
            )
            {
                continue;
            }

            knew[sharer] = true;


            for
            (
                var meeting
                : lists[sharer]
            )
            {

                if
                (
                    !knew[meeting.getValue()]
                    && time <= meeting.getKey()
                )
                {
                    queue.offer( meeting );
                }

            }


        }


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {

            if
            (
                knew[i]
            )
            {
                ans.add( i );
            }
            
        }


        return ans;
    }

}

class Solution
{

    public
    double
    maxAverageRatio
    (
        int[][] classes
        , int extraStudents
    )
    {
        PriorityQueue < double[] > pq = new PriorityQueue <> ( new ClassComparator() );
        
        double ans = 0;


        for
        (
            int[] clas
            : classes
        )
        {
            double a = ( double ) ( clas[0] );
            double b = ( double ) ( clas[1] );
            double c = ( ( double ) ( a ) ) / b;
            double d = ( ( double ) ( a ) + 1 ) / ( b + 1 );
            pq.offer( new double[] { d - c, a, b } );
        }


        while
        (
            extraStudents > 0
        )
        {
            double[] clas = pq.poll();
            double a = ( double ) ( clas[1] ) + 1;
            double b = ( double ) ( clas[2] ) + 1;
            double c = ( ( double ) ( a ) ) / b;
            double d = ( ( double ) ( a ) + 1 ) / ( b + 1 );
            pq.offer( new double[] { d - c, a, b } );
            extraStudents --;
        }


        for
        (
            double[] clas
            : pq
        )
        {
            ans += clas[1] / clas[2];
        }


        return ans / classes.length;
    }

}






class ClassComparator
implements Comparator < double[] >
{

    @Override
    public
    int
    compare
    (
        double[] x
        , double[] y
    )
    {
        return Double.compare( y[0], x[0] );
    }

}

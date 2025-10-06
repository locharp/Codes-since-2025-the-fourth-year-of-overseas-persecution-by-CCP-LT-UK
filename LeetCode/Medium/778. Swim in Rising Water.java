class Solution
{
    private static final int[][] dirs =
        { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        
    private PriorityQueue < Integer > priorityQueue;
    private int[][] grid;
    private boolean[][] visited;
    private int n;
    private int t;
    private int x;
    private int y;
    
    
    
    
    public
    int
    swimInWater
    (
        int[][] grid
    )
    {
        priorityQueue = new PriorityQueue <> ();
        this.grid = grid;
        n = grid.length;
        final int m = n - 1;
        visited = new boolean[n][n];
        priorityQueue.offer( grid[0][0] * 2500 );
        
        while
        (
            !visited[m][m]
        )
        {
            t = priorityQueue.peek() / 2500;
            x = ( priorityQueue.peek() / 50 ) % 50;
            y = priorityQueue.poll() % 50;
            swim( x, y );
        }
        
        
        return t;
    }
    
    
    
    
    private
    void
    swim
    (
        int i
        , int j
    )
    {
        visited[i][j] = true;
        
        
        for
        (
            int[] dir
            : dirs
        )
        {
            int r = i + dir[0];
            int c = j + dir[1];
            
            if
            (
                r < 0
                || r >= n
                || c < 0
                || c >= n
                || visited[r][c]
            )
            {
                continue;
            }
            
            if
            (
                grid[r][c] > t
            )
            {
                priorityQueue
                    .offer
                    (
                         ( grid[r][c] * 2500 )
                         + ( r * 50 )
                         + c
                    );
            }
            else
            {
                swim( r, c );
            }
            
        }
        
        
    }
    
}

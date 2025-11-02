class Solution
{
    char[][] grid;
    
    
    
    
    public
    int
    countUnguarded
    (
        int m
        , int n
        , int[][] guards
        , int[][] walls
    )
    {
        grid = new char[m][n];
        int ans = 0;     
        
        for
        (
            int[] wall
            : walls
        )
        {
            grid[wall[0]][wall[1]] = 'W';
        }
        
        
        for
        (
            int[] guard
            : guards
        )
        {
            grid[guard[0]][guard[1]] = 'G';
            guardH( guard[0], guard[1] );
            guardV( guard[0], guard[1] );
        }
        
        
        for
        (
            char[] r
            : grid
        )
        {
            
            
            for
            (
                char c
                : r
            )
            {
                
                if
                (
                    Character.valueOf( c ) == '\0'
                )
                {
                    ans ++;
                }
                
            }
            
            
        }
        
        
        return ans;
    }
    
    
    
    
    void
    guardH
    (
        int i
        , int j
    )
    {
        
        
        for
        (
            int k = j - 1
            ; k >= 0
                && grid[i][k] != 'G'
                && grid[i][k] != 'W'
                && grid[i][k] != 'H'
            ; k --
        )
        {
            grid[i][k] = 'H';
        }
        
        
        for
        (
            int k = j + 1
            ; k < grid[0].length
                && grid[i][k] != 'G'
                && grid[i][k] != 'W'
                && grid[i][k] != 'H'
            ; k ++
        )
        {
            grid[i][k] = 'H';
        }
        
        
    }
    
    
    
    
    void
    guardV
    (
        int i
        , int j
    )
    {
        
        
        for
        (
            int k = i - 1
            ; k >= 0
                && grid[k][j] != 'G'
                && grid[k][j] != 'W'
                && grid[k][j] != 'V'
            ; k --
        )
        {
            grid[k][j] = 'V';
        }
        
        
        for
        (
            int k = i + 1
            ; k < grid.length
                && grid[k][j] != 'G'
                && grid[k][j] != 'W'
                && grid[k][j] != 'V'
            ; k ++
        )
        {
            grid[k][j] = 'V';
        }
        
        
    }
}

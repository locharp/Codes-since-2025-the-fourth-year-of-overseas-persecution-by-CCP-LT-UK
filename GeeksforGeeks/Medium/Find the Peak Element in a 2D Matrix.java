class Solution
{
    private static final int [][] dir
        =  { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
    
    
    
    
    public
    ArrayList < Integer >
    findPeakGrid
    (
        int [][] mat
    )
    {
        final ArrayList < Integer > answer = new ArrayList <> ( 2 );
        final int n = mat.length;
        final int m = mat[0].length;
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            
            
            loopJ:
            for
            (
                int j = 0
                ; j < m
                ; j ++
            )
            {
                
                
                for
                (
                    int [] d
                    : dir
                )
                {
                    final int x = i + d[0];
                    final int y = j + d[1];
                    
                    if
                    (
                        x >= 0
                        && x < n
                        && y >= 0
                        && y < m
                        && mat[i][j] < mat[x][y]
                    )
                    {
                        continue loopJ;
                    }
                    
                }
                
                
                answer.add( i );
                answer.add( j );
                
                
                return answer;
            }
            
            
        }
        
        
        return answer;
    }
    
}

class Solution
{
    int ans;
    int n;
    int k;
    ArrayList < Integer > [] tree;
    int [] values;
    
    
    
    
    public
    int
    maxKDivisibleComponents
    (
        int n
        , int[][] edges
        , int[] values
        , int k
    )
    {
        ans = 0;
        this.n = n;
        this.k = k;
        tree = buildTree( edges );
        this.values = values;
        
        solve( 0, n );
        
        
        return ans;
    }
    
    
    
    
    ArrayList < Integer > []
    buildTree
    (
        int[][] edges
    )
    {
        ArrayList < Integer > [] tree = new ArrayList [n];
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            tree[i] = new ArrayList <> ();
        }
        
        
        for
        (
            int[] edge
            : edges
        )
        {
             tree[edge[0]].add( edge[1] );
             tree[edge[1]].add( edge[0] );
        }
        
        
        return tree;
    }
    
    
    
    
    int
    solve
    (
        int i
        , int p
    )
    {
        
        
        for
        (
            int j
            : tree[i]
        )
        {
            
            if
            (
                j == p
            )
            {
                continue;
            }
            
            values[i] = ( values[i] + solve( j, i ) ) % k;
        }
        
        if
        (
            values[i] % k == 0
        )
        {
            ans ++;
        }
        
        return values[i];
    }
    
}

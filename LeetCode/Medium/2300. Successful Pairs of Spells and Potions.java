class Solution
{
    
    public
    int[]
    successfulPairs
    (
        int[] spells
        , int[] potions
        , long success
    )
    {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            int left = 0;
            int right = m;
            long need = ( success + spells[i] - 1 ) / spells[i];
            
            
            while
            (
                left < right
            )
            {
                int mid = ( left + right ) / 2;
                
                if 
                (
                    potions[mid] < need
                )
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid;
                }
                
            }
            
            
            ans[i] = m - left;
        }
        
        
        return ans;
    }
    
}
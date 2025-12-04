class Solution
{

    public
    int
    countCollisions
    (
        String directions
    )
    {
        int ans = 0;
        int left = 0;
        int right = directions.length() - 1;
        
        
        while
        (
            left <= right
            && directions.charAt( left ) == 'L'
        )
        {
            left ++;
        }
        
        
        while
        (
            right >= left
            && directions.charAt( right ) == 'R'
        )
        {
            right --;
        }
        
        
        while
        (
            left <= right
        )
        {
            
            if
            (
                directions.charAt( right ) != 'S'
            )
            {
                  ans ++;
            }
            
            right --;
        }
        
        
        return ans;
    }
    
}

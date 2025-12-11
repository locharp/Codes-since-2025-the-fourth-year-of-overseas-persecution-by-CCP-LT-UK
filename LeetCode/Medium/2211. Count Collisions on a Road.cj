class Solution
{
    static private const LEFT: UInt8 = 76u8
    static private const RIGHT: UInt8 = 82u8
    static private const STOPPED: UInt8 = 83u8
    
    
    
    
    func
    countCollisions
    (
        directions: String
    )
    : Int64
    {
        var ans = 0
        var left = 0
        var right= directions.size - 1
        
        
        while
        (
            left <= right &&
            directions[left] == LEFT
        )
        {
            left ++
        }
        
        
        while
        (
            right >= left &&
            directions[right] == RIGHT
        )
        {
             right --
        }
        
        
        if
        (
            left > right
        )
        {
            0
        }
        else
        {
            right - left - directions[left..right + 1].count( "S" ) + 1
        }
        
    }
    
}

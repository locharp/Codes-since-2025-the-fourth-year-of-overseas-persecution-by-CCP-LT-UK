class Solution
{
    
    func
    countPartitions
    (
        nums: Array < Int64 >
    )
    : Int64
    {
        let iterator = nums.iterator()
        let sum = iterator.fold( 0, { x, y => x + y } )
        
        if
        (
            sum % 2 == 0
        )
        {
            nums.size - 1
        }
        else
        {
            0
        }
        
    }
    
}
